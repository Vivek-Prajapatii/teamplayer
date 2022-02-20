package com.teamplayer.teamplayer.services;

import java.util.List;

import com.teamplayer.teamplayer.entities.Player;
import com.teamplayer.teamplayer.entities.Result;
import com.teamplayer.teamplayer.entities.Team;


public interface TeamService {
    
    public List<Team> getTeams();

    public Team getTeam(long teamId);
    
    public Result addTeam(Team team);

    public Result updateTeam(Team team, long teamId);
    
    public Result deleteTeam(long teamId);

    public List<Player> getPlayers();

    public Player getPlayer(long playeId);

    //for players
    public Result addPlayer(long teamId, Player player);

    public Result updatePlayer(Player player, long playerId);

    public Result deletePlayer(long playerId);

}
