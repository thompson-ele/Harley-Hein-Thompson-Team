/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.model.Character;
import java.util.Random;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author ethompson
 */
public class CharacterControl {
    
    public int rollDice(int sides) {
        int roll;
        Random rand = new Random();
        
        roll = rand.nextInt(sides) + 1;
        return roll;
    }
    
    public static Character createCharacter(String name) {
        
        if(name == null){
            return null;
        }
        
        Character character = new Character();
        character.setName(name);
        
        TheChosenQuest.setHero(character); //save the character
        
        return character;
        
    }
    
    // Calculates characters initial stats
    public int[] calcCharacterStats(Character hero) {
        
        int[] values = null;
        
        // Get 5 different scores
        for (int i = 0; i < 5; i++) {
            
            int totalScore = 0; // Keep track of total score
            int lowestScore = 0; // Lowest score will not be included in final score
            
            // Roll the dice 4 times
            for(int j = 0; j < 4; j++) {
                // Roll the dice
                int roll = rollDice(6); // Six sided dice
                
                // Add dice roll to the total score
                totalScore += roll;
                
                // Compare this roll to previous rolls
                // If it's the first roll, store in lowestScore
                if(j == 0) {
                    lowestScore = roll;
                    
                // For all other rolls, compare to existing value, set value
                } else {
                    if(roll < lowestScore) {
                        lowestScore = roll;
                    }
                }
            }
            
            // Subtract the lowest Score from the totalScore
            totalScore -= lowestScore;
            
            // Store this score in the array
            values[i] = totalScore;
        }
        
        
        return values;
    }
}
