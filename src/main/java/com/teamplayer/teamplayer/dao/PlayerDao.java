package com.teamplayer.teamplayer.dao;

import com.teamplayer.teamplayer.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player, Long>{
    
}
