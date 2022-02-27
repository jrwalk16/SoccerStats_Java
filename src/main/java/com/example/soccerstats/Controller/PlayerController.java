package com.example.soccerstats.Controller;


import com.example.soccerstats.model.Player;
import com.example.soccerstats.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public void setPlayerService(PlayerService playerService){this.playerService = playerService;}

    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player playerObject){
        return playerService.createPlayer(playerObject);
    }

    @GetMapping("/players/{playerId}/")
    public Optional<Player> getPlayer(@PathVariable(value = "playerId") Long playerId){
        return playerService.getPlayer(playerId);
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PutMapping("/players/{playerId}/")
    public Player updatePlayer(@PathVariable(value = "playerId") Long playerId, @RequestBody Player playerObject){
        return playerService.updatePlayer(playerId, playerObject);
    }
}
