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
 * @author rileyhein
 */
public class CreatureControlTest {
    
    public CreatureControlTest() {
    }

    /**
     * Test of getAttack method, of class CreatureControl.
     */
    @Test
    public void testGetAttack() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int weaponValue = 1;
        int strengthValue = 1;
        int diceRoll = 1;
        int expResult = 3;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetAttack2() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int weaponValue = -1;
        int strengthValue = -1;
        int diceRoll = 0;
        int expResult = -1;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
        
    
    @Test
    public void testGetAttack4() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int weaponValue = -7;
        int strengthValue = -6;
        int diceRoll = -5;
        int expResult = -1;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetAttack5() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int weaponValue = 0;
        int strengthValue = 2;
        int diceRoll = 1;
        int expResult = 3;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetAttack6() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int weaponValue = 2;
        int strengthValue = 5;
        int diceRoll = 10;
        int expResult = 17;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testGetAttack7() {
        System.out.println("getAttack");
        
        /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int weaponValue = 5;
        int strengthValue = 8;
        int diceRoll = 20;
        int expResult = 33;
        
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getAttack(weaponValue, strengthValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getDefense method, of class CreatureControl.
     */
    @Test
    public void testGetDefense() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int armorValue = 1;
        int diceRoll = 1;
        int expResult = 1;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense2() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int armorValue = -1;
        int diceRoll = 0;
        int expResult = -1;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense3() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int armorValue = -3;
        int diceRoll = -8;
        int expResult = -1;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense4() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int armorValue = -7;
        int diceRoll = -7;
        int expResult = -1;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense5() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int armorValue = 2;
        int diceRoll = 1;
        int expResult = 2;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense6() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int armorValue = 15;
        int diceRoll = 10;
        int expResult = 15;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDefense7() {
        System.out.println("getDefense");
        
        /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int armorValue = 25;
        int diceRoll = 20;
        int expResult = 25;
        
        
        CreatureControl instance = new CreatureControl();
        
        
        int result = instance.getDefense(armorValue, diceRoll);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHP method, of class CreatureControl.
     */
    @Test
    public void testGetHP() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #1
         *******************************/
        System.out.println("Test Case #1");
        
        int constitutionValue = 1;
        int getDefense = 1;
        int expResult = 0;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetHP2() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #2
         *******************************/
        System.out.println("Test Case #2");
        
        int constitutionValue = -4;
        int getDefense = 0;
        int expResult = -1;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetHP3() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #3
         *******************************/
        System.out.println("Test Case #3");
        
        int constitutionValue = -8;
        int getDefense = -4;
        int expResult = -1;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testGetHP4() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #4
         *******************************/
        System.out.println("Test Case #4");
        
        int constitutionValue = -7;
        int getDefense = -5;
        int expResult = -1;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
      @Test
    public void testGetHP5() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #5
         *******************************/
        System.out.println("Test Case #5");
        
        int constitutionValue = 4;
        int getDefense = 1;
        int expResult = 3;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetHP6() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #6
         *******************************/
        System.out.println("Test Case #6");
        
        int constitutionValue = 10;
        int getDefense = 9;
        int expResult = 1;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetHP7() {
        System.out.println("getHP");
        
        /********************************
         * Test Case #7
         *******************************/
        System.out.println("Test Case #7");
        
        int constitutionValue = 20;
        int getDefense = 15;
        int expResult = 5;
        
        CreatureControl instance = new CreatureControl();
        
        int result = instance.getHP(constitutionValue, getDefense);
        assertEquals(expResult, result);
        
    }
    
}
