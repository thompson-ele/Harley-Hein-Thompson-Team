/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Inventory;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.view.GameMenuView;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
public class GameController {

    public static Player createPlayer(String name) {
        
        if(name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        TheChosenQuest.setPlayer(player); //save the player
        
        return player;
        
    }

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game();//create new game
        TheChosenQuest.setCurrentGame(game); // save 
        
        game.setPlayer(player); //save player in game
        
        Inventory[] inventoryList = GameController.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapController.createMap(); // create and initialize new map
        game.setMap(map);
        
        //move actors to starting position in the map
        MapController.moveActorsToStartingLocation(map);
                
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("Stub function: GameController class, assignScenesToLocations() called");
    }
    
    public int createGame(int numberOfGames){
        
        //variables
        int gameFile = 1;
        
        if(numberOfGames <= 0){
            
            System.out.println("Start new game");
            return -1;
        }
        
        if(numberOfGames >= 1){
            
            System.out.println("Load game");
            return gameFile;
        }
        
        return gameFile;
    }
    
    public static Inventory[] createInventoryList(){
        
        // created array(list) of inventory item
        Inventory[] inventory = new Inventory[14];
        
        Inventory weapons = new Inventory();
        weapons.setDescription("Weapons");
        weapons.setQuantityInStock(0);
        weapons.setRequiredAmount(0);
        //inventory[Item.weapons.ordinal()] = weapons;
        
        Inventory gold = new Inventory();
        gold.setDescription("Gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        //inventory[Item.gold.ordinal()] = gold;
        
        return inventory;
        
    }
   

}
