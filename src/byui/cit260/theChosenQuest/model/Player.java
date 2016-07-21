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
    private double strength;
    private double hitpoints;
    private String equippedArmor;
    private String equippedWeapons;
    private String playerClass;
    private String race;
    private Location location;
    private Item[] inventory;
    
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
    
    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(String equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public String getEquippedWeapons() {
        return equippedWeapons;
    }

    public void setEquippedWeapons(String equippedWeapons) {
        this.equippedWeapons = equippedWeapons;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        location.setVisited(true);
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
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
