/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.exception.MapControlException;
import byui.cit260.theChosenQuest.model.Map;

/**
 *
 * @author tharley
 */
public class MapController {

    static void moveActorsToStartingLocation(Map map) {
        // Need to add method here
        System.out.println("Stub Function: moveActorsToStartingLocation() called");
    }

    
    public int calcMapBorders(int mapWidth, int mapHeight){

        // set variables
        int area = mapWidth * mapHeight;

        if(mapHeight <= -1 || mapWidth <= -1){
            //display error
            System.out.println("There was an error, please try again");
            return -1; 
        }
             
    return area;
        
    }
   
    // The map should have a throw exception, but not sure what the exception should be just yet...
    public static Map createMap() throws MapControlException {
        
        //create the map
        Map map = null;
        
        System.out.println("\n*** createMAP() called ***");
        
        return map;
    }
        
}
