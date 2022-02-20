package com.teamplayer.teamplayer.services;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;
import com.teamplayer.teamplayer.dao.PlayerDao;
import com.teamplayer.teamplayer.dao.TeamDao;
import com.teamplayer.teamplayer.entities.Player;
import com.teamplayer.teamplayer.entities.Result;
import com.teamplayer.teamplayer.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamDao teamDao;
    @Autowired
    private PlayerDao playerDao;


    @Override
    public List<Team> getTeams() {
        return teamDao.findAll();
    }


    @Override
    public Team getTeam(long teamId) {
        return teamDao.findById(teamId).get();
    }


    @Override
    public Result addTeam(Team team) {
        try{
            teamDao.save(team);
            //Team t = teamDao.getById(team.getId());
            Result result = new Result("Success","Team added");
            return result;
        }
        catch(Exception e){
            Result result = new Result("Failed!!",e.toString());
            return result;
        }
    }


    @Override
    public Result addPlayer(long teamId, Player player)
    {
        try{
            Team team = getTeam(teamId);
            List<Player> lp = team.getPlayers();
            lp.add(player);
            team.setPlayers(lp); 
            teamDao.save(team);
            Result result = new Result("Success","Player added");
            return result;      
    }
    catch(Exception e){
        Result result = new Result("Failed!!",e.toString());
        return result;
    }
    }


    @Override
    public Result updateTeam(Team team, long teamId) {
        try{
            Team t = getTeam(teamId);
            t.setName(team.getName());
            t.setLocation(team.getLocation());
            t.setCreated(team.getCreated());
            t.setUpdated((java.util.Date)new Date(teamId));
            teamDao.save(t);
            Result result = new Result("Success","Team Updated");
            return result;
        }
        catch(Exception e){
            Result result = new Result("Failed!!",e.toString());
            return result;
        }
    }

    
    @Override
    public Result deleteTeam(long teamId) {
        try{
            teamDao.deleteById(teamId);
            Result result = new Result("Success","Team Deleted");
            return result; 
        }
        catch(Exception e)
        {
            Result result = new Result("Failed!!",e.toString());
            return result;
        }
    }

    
    @Override
    public Player getPlayer(long playerId) {

        Player p1 = new Player();

        List<Player> player = getPlayers() ;
        for(Player p2 : player)
        {
            if(playerId == p2.getId())
            {
                p1 = p2;
                System.out.println(p1.getId() + p1.getName() + p1.getAge());
                break;
            }
        }
        
        return p1;
    }


    @Override
    public List<Player> getPlayers() {
        return playerDao.findAll();
    }


    @Override
    public Result updatePlayer(Player player, long playerId) {
        try{
            Player p = getPlayer(playerId);
            p.setName(player.getName());
            p.setAge(player.getAge());
            p.setUpdatedAt((java.util.Date)new Date(playerId));
            playerDao.save(p);
            Result result = new Result("Success","Player Updated");
            return result;
        }
        catch(Exception e)
        {
            Result result = new Result("Failed!!",e.toString());
            return result;
        }
    }


    @Override
    public Result deletePlayer(long playerId) {
        try{
            playerDao.deleteById(playerId);
            Result result = new Result("Success","Player Deleted");
            return result;
        }
        catch(Exception e)
        {
            Result result = new Result("Failed!!",e.toString());
            return result;
        }
    }

 
    
    

}
