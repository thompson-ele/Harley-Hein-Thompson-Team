/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Item;
import byui.cit260.theChosenQuest.model.Location;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Scene;
import byui.cit260.theChosenQuest.view.MapView;
import java.util.Random;
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

        return map;
    }

    public static void assignItemsToLocations() {
        Map map = TheChosenQuest.getCurrentGame().getMap();
        Item[] inventory = TheChosenQuest.getCurrentGame().getInventory();              
  
        Location location1 = map.getLocation(1, 1);
        location1.setItem(inventory[0]);       
        
        Location location2 = map.getLocation(2, 2);
        location2.setItem(inventory[1]);       
        
        Location location3 = map.getLocation(3, 3);
        location3.setItem(inventory[2]);       
        
        Location location4 = map.getLocation(4, 4);
        location4.setItem(inventory[3]);       
        
    }    
 
    public void displayMap() {
        // display the map
        System.out.println(TheChosenQuest.getCurrentGame().getMap().getMapString());
        
        MapView mapView = new MapView();
        mapView.display();
    }

}
