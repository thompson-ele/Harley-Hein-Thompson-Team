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
public class GameControllerTest {
    
    public GameControllerTest() {
    }

    /**
     * Test of createGame method, of class GameController.
     */
    @Test
    public void testCreateGame() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int numberOfGames = 0;
        int expResult = -1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame2() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int numberOfGames = -1;
        int expResult = -1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame3() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int numberOfGames = -4;
        int expResult = -1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame4() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int numberOfGames = -3;
        int expResult = -1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame5() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int numberOfGames = 5;
        int expResult = 1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame6() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int numberOfGames = 7;
        int expResult = 1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    @Test
    public void testCreateGame7() {
        System.out.println("createGame");
        
         /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int numberOfGames = 2;
        int expResult = 1;
        
        //create a new instance
        GameController instance = new GameController();
        
        int result = instance.createGame(numberOfGames);
        assertEquals(expResult, result);
    }
    
}
