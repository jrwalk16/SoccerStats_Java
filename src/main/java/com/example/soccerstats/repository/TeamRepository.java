package com.example.soccerstats.repository;


import com.example.soccerstats.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByTeamName(String teamName);

    List<Team> findAllByPlayer_Id(Long id);
}
