package com.example.soccerstats.service;

import com.example.soccerstats.exceptions.InformationExistException;
import com.example.soccerstats.exceptions.InformationNotFoundException;
import com.example.soccerstats.model.Player;
import com.example.soccerstats.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public void setPlayerRepository(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(Player playerObject){
        Player player = playerRepository.findByPlayerName(playerObject.getPlayerName());
        if(player != null){
            throw new InformationExistException("player with name " + player.getPlayerName() + "already exists");
        } else {
            return playerRepository.save(playerObject);
        }
    }

    public Optional<Player> getPlayer(Long playerId){
        Optional<Player> player = playerRepository.findById(playerId);
        if(player.isPresent()){
            return player;
        } else {
            throw new InformationNotFoundException("player with id " + playerId + " not found");
        }
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

}
