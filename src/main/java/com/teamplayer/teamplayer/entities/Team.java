package com.teamplayer.teamplayer.entities;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="Team")
public class Team
{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teamId")
    private long teamId;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    private Date createdAt;
    private Date updatedAt;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="team_id", referencedColumnName = "teamId")
    
    private List<Player> player;

    @PrePersist
    protected void onCreate() {
    updatedAt = createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    updatedAt = new Date();
    }

    public long getId() {
        return this.teamId;
    }
    
    public void setId(long teamId) {
        this.teamId = teamId;
    }

    public Date getUpdated() {
        return updatedAt;
    }

    public void setUpdated(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreated() {
        return createdAt;
    }

    public void setCreated(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public List<Player> getPlayers() {
        return this.player;
    }

    public void setPlayers(List<Player> player) {
        this.player = player;
    }
    

    public Team(long teamId, String name, String location, List<Player> players)
    {
        super();
        this.teamId = teamId;
        this.name = name;
        this.location = location; 
        this.player = players;
    }
    
    
        public Team()
        {
            super();
        }
    
    
    }
    
