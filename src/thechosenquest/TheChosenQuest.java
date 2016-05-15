/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thechosenquest;

import byui.cit260.theChosenQuest.model.DungeonTypeScene;
import byui.cit260.theChosenQuest.model.ForestTypeScene;
import byui.cit260.theChosenQuest.model.Locations;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.model.TownTypeScene;

/**
 *
 * @author tharley GIT HUB TEST TRAVIS THIS IS SOME JUNK BABY
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
        
    }
    
}
