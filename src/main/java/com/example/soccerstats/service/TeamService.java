package com.example.soccerstats.service;


import com.example.soccerstats.exceptions.InformationExistException;
import com.example.soccerstats.exceptions.InformationNotFoundException;
import com.example.soccerstats.model.Player;
import com.example.soccerstats.model.Team;
import com.example.soccerstats.repository.PlayerRepository;
import com.example.soccerstats.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    private TeamRepository teamRepository;

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public Team createTeam(Long playerId, Team teamObject){

        Optional<Player> player = playerRepository.findById(playerId);
        if(player.isEmpty()){
            throw new InformationNotFoundException("player with id " + playerId + " does not exist");
        }
        Team team = teamRepository.findByTeamName(teamObject.getTeamName());
        if(team != null){
            throw new InformationExistException("team with name " + team.getTeamName() + " already exists");
        }
        teamObject.setPlayer(player.get());
        return teamRepository.save(teamObject);
    }

}
