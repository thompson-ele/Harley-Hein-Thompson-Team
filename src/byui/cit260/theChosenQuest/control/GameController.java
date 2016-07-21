/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Armor;
import byui.cit260.theChosenQuest.model.Creature;
import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Weapon;
import byui.cit260.theChosenQuest.model.Character;
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
        
        Item[] itemList = GameController.createItemList();
        game.setInventory(itemList);
        
        Character[] creatureList = GameController.createCreatures();
        game.setCreatures(creatureList);
        
        Map map = MapController.createMap(); // create and initialize new map
        game.setMap(map);
        
              
        player.setLocation(map.getLocation(0, 0));
        
        MapController.assignItemsToLocations();
        MapController.assignCreaturesToLocations();
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
        Item[] inventory = new Item[4];
        
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
    
    public static Character[] createCreatures() {
        
        Character[] creatures = new Character[4];
        
        Creature creature1 = new Creature();
        creature1.setCreatureName("Ogre");
        creature1.setIntroductionText("Oh no! A giant ogre jumped out from the bushes!");
        creature1.setStrength(3);
        creature1.setHitpoints(5);
        
        Creature creature2 = new Creature();
        creature2.setCreatureName("Golem");
        creature2.setIntroductionText("A golem is lurking in the bushes. Don\'t touch his precious!");
        creature2.setStrength(2);
        creature2.setHitpoints(5);
        
        Creature creature3 = new Creature();
        creature3.setCreatureName("Giant");
        creature3.setIntroductionText("You woke a giant from his slumber! Get ready to fight!");
        creature3.setStrength(4);
        creature3.setHitpoints(5);
        
        Creature creature4 = new Creature();
        creature4.setCreatureName("Dragon");
        creature4.setIntroductionText("You got too close to the dragon\'s gold! Watch out for it\'s fiery breath!");
        creature4.setStrength(5);
        creature4.setHitpoints(8);

        return creatures; 
    }
   
}
