/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vmthompson
 */
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }

    /**
     * Test of rollDice method, of class CharacterControl.
     */
    @Test
    public void testRollDice() {
        System.out.println("rollDice");
        int sides = 6;
        int lowestScore = 1;
        CharacterControl instance = new CharacterControl();
        int expResult = 6;
        int result = instance.rollDice(sides);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcCharacterStats method, of class CharacterControl.
     */
    @Test
    public void testCalcCharacterStats() {
        System.out.println("calcCharacterStats");
        Character hero = null;
        CharacterControl instance = new CharacterControl();
        System.out.println(Arrays.toString(instance.calcCharacterStats(hero)));
        int[] expResult = {108,108,108,108,108};
        int[] result = instance.calcCharacterStats(hero);
        assertArrayEquals(expResult, result);
    }
    
}
