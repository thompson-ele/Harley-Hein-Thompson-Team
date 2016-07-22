/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Location;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Character;
import byui.cit260.theChosenQuest.model.Creature;
import byui.cit260.theChosenQuest.view.FightScreen;
import java.util.ArrayList;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Daniel
 */
public class MovementController {
    
    public void checkForItem(Location location) {
        // Check if Item exists
        if(location.getItem() != null) {
            // Print out a message
            System.out.println("You found a " + location.getItem().getItemName() + "!"
                               + "\nDescription: " + location.getItem().getDescription());
            // Add item to the Player's backpack
            // Remove item from the location
        }
    }
    
    public void checkForCreature(Location location) { // Will probably need to change return type to Character...
        // Check if Item exists
        if(location.getCreature() != null) {
            // Print out a message
            System.out.println("Oh no! A " + location.getCreature().getName() + " is attacking you!");
            // Remove creature from location
            
            // Go to FightView
            FightScreen fightScreen = new FightScreen();
            fightScreen.display();
        }
    }
    
    public boolean moveNorth(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == 0) {
            return false;
        }

        int currentCol = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;

        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
        // Check for Items and Creatures
        this.checkForItem(player.getLocation());
        this.checkForCreature(player.getLocation());

        return true;
    }

    public boolean moveEast(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == map.getColumnCount() - 1) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() + 1));
        
        // Check for Items and Creatures
        this.checkForItem(player.getLocation());
        this.checkForCreature(player.getLocation());

        return true;
    }

    public boolean moveSouth(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == map.getRowCount() - 1) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumn()));
        
        // Check for Items and Creatures
        this.checkForItem(player.getLocation());
        this.checkForCreature(player.getLocation());

        return true;
    }

    public boolean moveWest(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == 0) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() - 1));
        
        // Check for Items and Creatures
        this.checkForItem(player.getLocation());
        this.checkForCreature(player.getLocation());

        return true;
    }
}
