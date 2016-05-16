package thechosenquest;

import byui.cit260.theChosenQuest.model.BattleInterface;
import byui.cit260.theChosenQuest.model.Creature;
import byui.cit260.theChosenQuest.model.DungeonTypeScene;
import byui.cit260.theChosenQuest.model.ForestTypeScene;
import byui.cit260.theChosenQuest.model.Locations;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.model.TownTypeScene;
import byui.cit260.theChosenQuest.model.Character;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Inventory;
import byui.cit260.theChosenQuest.model.Gold;
import byui.cit260.theChosenQuest.model.Armor;
import byui.cit260.theChosenQuest.model.Weapon;

/**
 *
 * @author tharley, rhein, ethompson
 */
public class TheChosenQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne= new Player();
        
        playerOne.setName("Testing The Tester");
        playerOne.setPlayerClass("upper-middle class");
        playerOne.setRace("Dwarf");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // map test
        Map map= new Map();
        
        map.setRowCount(5.00);
        map.setColumnCount(10.00);
        map.setLocationsVisited("Funky-Town");
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        //locations test
        Locations location= new Locations();
        
        location.setColumn(5.00);
        location.setRow(10.00);
        location.setVisited("Dwarf town");
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        //scene test
        Scene scene= new Scene();
        
        scene.setDescription("This game is for cool people");
        scene.setLocationIcon("add image somehow here");
        
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);
        
        //foresttypescene
        ForestTypeScene forest= new ForestTypeScene();
        
        forest.setMathTrapOne(1.00);
        forest.setMathTropTwo(2.00);
        forest.setObjective("Figure out these confusing math problems");
        
        String forestInfo = forest.toString();
        System.out.println(forestInfo);
        
        //dungeontypescene
        DungeonTypeScene dungeon= new DungeonTypeScene();
        
        dungeon.setMathTrapOne(3.00);
        dungeon.setMathTropTwo(5.00);
        dungeon.setObjective("More math problmes for you kiddies");
       
        String dungeonInfo = dungeon.toString();
        System.out.println(dungeonInfo);
     
        //towntypescene
        TownTypeScene town= new TownTypeScene();
        
        town.setMathTrapOne(6.00);
        town.setMathTropTwo(7.00);
        town.setObjective("if you don't know this yet, it's another math trap");
        
        String townInfo = town.toString();
        System.out.println(townInfo);
        
                //creature code test
    Creature creature = new Creature();
    
    creature.setCreatureName("Giant Roach");
    
    String creatureInfo = creature.toString();
    System.out.println(creature);
   
   
        //character code test
    Character character = new Character();
    
    character.setName("Jebidiah");
    character.setCharisma(3);
    character.setConstitution(2);
    character.setDexterity(1);
    character.setEquippedArmor("Ancient Cuirass");
    character.setEquippedWeapons("Aurials Bow");
    character.setMagic(6);
    character.setStrength(6);
    character.setHitpoints(150);
    
    String characterInfo = character.toString();
    System.out.println(character);
    
        //battle interface test
    BattleInterface battleInterface = new BattleInterface();
    
    System.out.println("");
        
    }
    
}
    
