package com.example.soccerstats.Controller;


import com.example.soccerstats.model.Player;
import com.example.soccerstats.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
