package com.teamplayer.teamplayer.entities;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class Player {
    @Id
    private long playerId;

    private String name;

    private long age;

    private Date createdAt;
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate() {
    updatedAt = createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
    updatedAt = new Date();
    }

    public Player(long playerId, String name, long age) {
        super();
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        // this.createdAt = createdAt;
        // this.updatedAt = updatedAt;
    }   

    public Player()
    {
        super();
    }
 
    public long getId() {
        return this.playerId;
    }

    public void setId(long playerId) {
        this.playerId = playerId;
    }

    public Date getUpadatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date date) {
        this.updatedAt = (Date) date;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public long getAge() {
        return age;
    }
    
    public void setAge(long age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    

}
