package com.example.soccerstats.Controller;


import com.example.soccerstats.model.Team;
import com.example.soccerstats.service.PlayerService;
import com.example.soccerstats.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class TeamController {

    private TeamService teamService;

    @Autowired
    public void setTeamService(TeamService teamService){
        this.teamService = teamService;
    }

    private PlayerService playerService;

    @Autowired
    public void setPlayerService(PlayerService playerService){
        this.playerService = playerService;
    }

    @PostMapping("/players/{playerId}/teams/")
    public Team createTeam(@PathVariable(value = "playerId") Long playerId, @RequestBody Team teamObject) {
        return teamService.createTeam(playerId, teamObject);
    }

    @GetMapping("/players/{playerId}/teams/")
    public List<Team> getAllTeams(@PathVariable(value = "playerId")Long playerId){
        return teamService.getAllTeams(playerId);
    }

    @GetMapping("/players/{playerId}/teams/{teamId}")
    public Team getTeam(@PathVariable(value = "playerId") Long playerId, @PathVariable(value = "teamId") Long teamId){
        return teamService.getTeam(playerId, teamId);
    }
}
