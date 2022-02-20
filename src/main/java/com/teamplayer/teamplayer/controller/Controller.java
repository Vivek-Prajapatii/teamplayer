package com.teamplayer.teamplayer.controller;

import java.util.List;

import com.teamplayer.teamplayer.entities.Player;
import com.teamplayer.teamplayer.entities.Result;
import com.teamplayer.teamplayer.entities.Team;
import com.teamplayer.teamplayer.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired  //to create object of TeamService automatically and inject here.
    private TeamService teamService;
    
    
    @GetMapping("/home")
    public String hello()
    {
        return "Welcome to team player API";
    }


    //Get the Teams
    @GetMapping("/teams")
    public List<Team> getTeams()
    {
        return this.teamService.getTeams();
    }


    //to get the team info by teamId
    @GetMapping("/team/{teamId}")
    public Team getTeam(@PathVariable long teamId)
    {
        return this.teamService.getTeam(teamId);
    }


    //to add a team in th e list.
    @PostMapping("/team")
    public Result addTeam(@RequestBody Team team)
    {
        return this.teamService.addTeam(team);        
    }


    @PostMapping("/team/{teamId}/player")
    public Result addPlayer(@PathVariable long teamId,@RequestBody Player player)
    {
        return this.teamService.addPlayer(teamId,player);
    }


    //to update the team name info by teamId
    @PutMapping("/team/{teamId}")
    public Result updateTeam(@RequestBody Team team, @PathVariable long teamId) 
    {
        return this.teamService.updateTeam(team, teamId);
    }


    //to update the player info by using playerId
    @PutMapping("/player/{playerId}")
    public Result updatePlayer(@RequestBody Player player, @PathVariable long playerId)
    {
        return this.teamService.updatePlayer(player , playerId);
    }


     //to delete a team by teamId
     @DeleteMapping("/team/{teamId}")
     public Result deleteTeam(@PathVariable long teamId)
     {
         return this.teamService.deleteTeam(teamId);
     }


    @GetMapping("/players")
    public List<Player> getPlayers()
    {
        return this.teamService.getPlayers();
    } 


    //to get the Players by playerId and teamId
    @GetMapping("/player/{playerId}")
    public Player getPlayer(@PathVariable long playerId)
    {
        return this.teamService.getPlayer(playerId);
    }


    //to delete a player by playerId
    @DeleteMapping("/player/{playerId}")
    public Result deletePlayer(@PathVariable long playerId)
    {
        return this.teamService.deletePlayer(playerId);
    }



}
