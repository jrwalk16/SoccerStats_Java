package com.example.soccerstats.model;




public class Player {


    private Long id;


    private String playerName;

    private String position;

    private Integer goalsScored;

    private Integer assists;

    private Integer cleanSheets;

    public Player() {
    }

    public Player(Long id, String playerName, String position, Integer goalsScored, Integer assists, Integer cleanSheets) {
        this.id = id;
        this.playerName = playerName;
        this.position = position;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.cleanSheets = cleanSheets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }
}
