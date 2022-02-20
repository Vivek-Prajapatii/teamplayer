package com.teamplayer.teamplayer.dao;

import com.teamplayer.teamplayer.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao extends JpaRepository<Team, Long>{
    
}
