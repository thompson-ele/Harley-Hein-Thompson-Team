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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcArmorLevel method, of class InventoryControl.
     */
    @Test
    public void testCalcArmorLevel() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int armorType = 5;
        int expResult = 10;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel2() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int armorType = -1;
        int expResult = -1;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel3() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int armorType = -4;
        int expResult = -1;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel4() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int armorType = -5;
        int expResult = -1;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel5() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int armorType = 0;
        int expResult = 5;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel6() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int armorType = 5;
        int expResult = 10;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }
    @Test
    public void testCalcArmorLevel7() {
        System.out.println("calcArmorLevel");
        
        /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int armorType = 5;
        int expResult = 10;
        
        //create an instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcArmorLevel(armorType);

        assertEquals(expResult, result);
    }

    /**
     * Test of calcGoldAmount method, of class InventoryControl.
     */
    @Test
    public void testCalcGoldAmount() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int currentGold = 5;
        int expResult = 6;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount2() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int currentGold = -1;
        int expResult = -1;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount3() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int currentGold = -2;
        int expResult = -1;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount4() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int currentGold = -10;
        int expResult = -1;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount5() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int currentGold = 0;
        int expResult = 1;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount6() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int currentGold = 5;
        int expResult = 6;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcGoldAmount7() {
        System.out.println("calcGoldAmount");
        
        /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int currentGold = 5;
        int expResult = 6;
        
        // create a new instance 
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcGoldAmount(currentGold);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of calcMagicLevel method, of class InventoryControl.
     */
    @Test
    public void testCalcMagicLevel() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int currentMagic = 7;
        int expResult = 12;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel2() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int currentMagic = -7;
        int expResult = -1;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel3() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int currentMagic = -6;
        int expResult = -1;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel4() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int currentMagic = -4;
        int expResult = -1;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel5() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int currentMagic = 5;
        int expResult = 10;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel6() {
        System.out.println("calcMagicLevel");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int currentMagic = 9;
        int expResult = 14;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    @Test
    public void testCalcMagicLevel7() {
        System.out.println("calcMagicLevel");
        
        /*******************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int currentMagic = 4;
        int expResult = 9;
        
        //create a new instance
        InventoryControl instance = new InventoryControl();
        
        //call function
        int result = instance.calcMagicLevel(currentMagic);
        
        assertEquals(expResult, result);
    }
    
}
