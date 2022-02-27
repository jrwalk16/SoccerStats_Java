package com.example.soccerstats.model;


import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String teamName;


    @Column
    private String teamCity;

    @Column
    private String teamCountry;

    @OneToOne
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team() {
    }

    public Team(Long id, String teamName, String teamCity, String teamCountry) {
        this.id = id;
        this.teamName = teamName;
        this.teamCity = teamCity;
        this.teamCountry = teamCountry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }
}
