/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

/**
 *
 * @author tharley
 */
public class MapController {

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
   
        
}
