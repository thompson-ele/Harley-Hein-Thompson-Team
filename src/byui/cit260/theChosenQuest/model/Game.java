/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;

/**
 *
 * @author Travis Harley
 */
public class Game implements Serializable {
    
/**
 * 
 * NOTE FOR TEACHER: according to our UML we do not have other relationships 
 * for our Game.java. We only have the map and player classes that 
 * have a one to many relationship.
 * 
 */
    
    // variables
    private double totalTime;
    private Player player;
    private Map map;
    private Inventory[] inventory;

    // getter setters
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }
    
    
    



}
