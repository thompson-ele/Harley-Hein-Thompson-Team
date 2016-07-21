/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.view.MapView;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author tharley
 */
public class MapController {

    public int calcMapBorders(int mapWidth, int mapHeight) {

        // set variables
        int area = mapWidth * mapHeight;

        if (mapHeight <= -1 || mapWidth <= -1) {
            //display error
            System.out.println("There was an error, please try again");
            return -1;
        }

        return area;

    }

    public static Map createMap() {
        //create the map
        Map map = new Map(6, 6);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to location
        GameController.assignScenesToLocations(map, scenes);

        return map;
    }

    public void assignItemsToLocations() {
        Map map = TheChosenQuest.getCurrentGame().getMap();
        Item[] inventory = TheChosenQuest.getCurrentGame().getInventory();
        
        // Loop through each item in the Item array
        for(int i = 0; i < inventory.length; i++) {
            // If the spot in the array isn't empty
            if(inventory[i] != null) {
                // Assign the item to a random location
            }
        }
    }
    
    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[Scene.SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("This is our description for the create scenes junk");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations! another description");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[Scene.SceneType.finish.ordinal()] = finishScene;

        Scene campScene = new Scene();
        campScene.setDescription("CampScene descriptions");
        campScene.setMapSymbol(" BY ");
        campScene.setBlocked(false);
        campScene.setTravelTime(600);
        scenes[Scene.SceneType.camp.ordinal()] = campScene;

        return scenes;
    }
    
    public void displayMap() {
        // display the map
        System.out.println(TheChosenQuest.getCurrentGame().getMap().getMapString());
        
        MapView mapView = new MapView();
        mapView.display();
    }

}
