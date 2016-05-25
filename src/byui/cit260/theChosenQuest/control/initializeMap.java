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
public class initializeMap {
    
    public initializeMap(){
        
        // set variables
        int mapWidth = 5;
        int mapHeight = 5;
        int area = mapWidth * mapHeight;
        
        if(mapHeight <=0 || mapWidth <=0){
            
            //display error
            System.out.println("There was an error, please try again");
            
        }else if(mapHeight > 5 || mapWidth > 5){
            
            //display error
            System.out.println("There was an error, please try again");
            
        }else{
            
            System.out.println("The map size is["+area+"]" );

        }
    }
    
    // build out an image of the map
        
        
}