/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tharley
 */
public class Player implements Serializable {
    
    private String name;
    private String playerClass;
    private String race;
    
    // constructor
    public Player() {
    }

    // getter setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    // equals and hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.playerClass);
        hash = 53 * hash + Objects.hashCode(this.race);
        return hash;
    }
    
    // toString function

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerClass=" + playerClass + ", race=" + race + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.playerClass, other.playerClass)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        return true;
    }
    
    
}
