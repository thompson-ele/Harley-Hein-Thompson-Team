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
        
        // display the map
//        System.out.println("MAP OF THE LAND | The map size is ["+area+"] \n" 
//               + "\n"
//               + "            A       B       C       D       E\n"
//               + "        |---------------------------------------|\n"
//               + "        |       |       |       |       |       |\n"
//               + "    1   |   1   |   2   |   3   |   4   |   5   |\n"
//               + "        |       |       |       |       |       |\n"
//               + "        ----------------------------------------|\n"
//               + "        |       |       |       |       |       |\n"
//               + "    2   |   6   |   7   |   8   |   9   |   10  |\n"
//               + "        |       |       |       |       |       |\n"
//               + "        ----------------------------------------|\n"
//               + "        |       |       |       |       |       |\n"
//               + "    3   |   11  |   12  |   13  |   14  |   15  |\n"
//               + "        |       |       |       |       |       |\n"
//               + "        ----------------------------------------|\n"
//               + "        |       |       |       |       |       |\n"
//               + "    4   |   16  |   17  |   18  |   19  |   20  |\n"
//               + "        |       |       |       |       |       |\n"
//               + "        ----------------------------------------|\n"
//               + "        |       |       |       |       |       |\n"
//               + "    5   |   21  |   22  |   23  |   24  |   25  |\n"
//               + "        |       |       |       |       |       |\n"
//               + "        ----------------------------------------|\n"
//       );
       
        return area;
        
    }
   
        
}
