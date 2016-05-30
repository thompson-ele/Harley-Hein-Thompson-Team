/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Travis Harley
 */
public class MapControllerTest {
    
    public MapControllerTest() {
    }

    /**
     * Test of calcMapBorders method, of class MapController.
     */
    @Test
    public void testCalcMapBorders() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int mapWidth = 5;
        int mapHeight = 5;
        int expResult = 25;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
    @Test
    public void testCalcMapBorders2() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int mapWidth = 4;
        int mapHeight = 3;
        int expResult = 12;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
    @Test
    public void testCalcMapBorders3() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #3        
         *******************************/
        System.out.println("Test Case #3");
        
        int mapWidth = -1;
        int mapHeight = 3;
        int expResult = -1;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
   @Test
    public void testCalcMapBorders4() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #4        
         *******************************/
        System.out.println("Test Case #4");
        
        int mapWidth = 4;
        int mapHeight = -1;
        int expResult = -1;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
    @Test
    public void testCalcMapBorders5() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #5       
         *******************************/
        System.out.println("Test Case #5");
        
        int mapWidth = -5;
        int mapHeight = 8;
        int expResult = -1;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
    @Test
    public void testCalcMapBorders6() {
        System.out.println("calcMapBorders");
        
        /********************************
         * Test Case #6       
         *******************************/
        System.out.println("Test Case #6");
        
        int mapWidth = 0;
        int mapHeight = 5;
        int expResult = 0;
        
        // create instance of MapController class
        MapController instance = new MapController();
        
        //call function
        int result = instance.calcMapBorders(mapWidth, mapHeight);
        
        //compare expecte return value
        assertEquals(expResult, result);   
    }
    @Test
        public void testCalcMapBorders7() {
            System.out.println("calcMapBorders");

            /********************************
             * Test Case #7       
             *******************************/
            System.out.println("Test Case #7");

            int mapWidth = 5;
            int mapHeight = 0;
            int expResult = 0;

            // create instance of MapController class
            MapController instance = new MapController();

            //call function
            int result = instance.calcMapBorders(mapWidth, mapHeight);

            //compare expecte return value
            assertEquals(expResult, result);   
        }    

}
