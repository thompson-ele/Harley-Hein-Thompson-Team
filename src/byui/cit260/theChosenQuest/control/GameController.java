/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.GameControllerException;
import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Armor;
import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Inventory;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.model.Weapon;
import byui.cit260.theChosenQuest.view.GameMenuView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    private String filepath = "output.txt";

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game();//create new game
        TheChosenQuest.setCurrentGame(game); // save 
        
        game.setPlayer(player); //save player in game
        
        Item[] itemList = GameController.createItemList();
        game.setInventory(itemList);
        
        Map map = MapController.createMap(); // create and initialize new map
        game.setMap(map);
        
        player.setLocation(map.getLocation(0, 0));
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
    
    public static Item[] createItemList(){
        
        // created array(list) of inventory item
        Item[] inventory = new Item[14];
        
        // Descriptions and stats of weapons and armor go here
        Weapon sword1 = new Weapon();
        sword1.setItemName("Master Sword");
        sword1.setDescription("A legendary sword from Hyrule");
        sword1.setDexterityBonus(0);
        sword1.setStrengthBonus(4);
        inventory[0] = sword1;
        
        Weapon sword2 = new Weapon();
        sword2.setItemName("Anduril");
        sword2.setDescription("This sword was reforged from the \n"
                              + "shards of Narsil" );
        sword2.setDexterityBonus(1);
        sword2.setStrengthBonus(3);
        inventory[1] = sword2;
        
        Weapon bow = new Weapon();
        bow.setItemName("Bow and Arrows");
        bow.setDescription("These will help you attack from afar");
        bow.setDexterityBonus(5);
        bow.setStrengthBonus(2);
        inventory[2] = bow;
        
        Armor helmet = new Armor();
        helmet.setItemName("Helmet");
        helmet.setDescription("This is a helmet. It will protect your head");
        helmet.setDexterityBonus(1);
        helmet.setBaseValue(3);
        inventory[3] = helmet;
        
        return inventory;
        
    }
    
    
   public static void saveGame(Game game, String filepath)
           throws GameControllerException {
   
       try( FileOutputStream fops = new FileOutputStream(filepath)){
       ObjectOutputStream output = new ObjectOutputStream(fops);
       
       output.writeObject(game); //write the game object out to file
       }
       catch(Exception e) {
           throw new GameControllerException(e.getMessage());
       }
   }
   
   public static void getSavedGame(String filepath)
            throws GameControllerException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
                ObjectInputStream input = new ObjectInputStream(fips);
                
                game = (Game) input.readObject();//read the game object from the file
   }
   catch(Exception e) {
            throw new GameControllerException(e.getMessage());
}
   //close the file
   TheChosenQuest.setCurrentGame(game); //save in theChosenQuest

   }
