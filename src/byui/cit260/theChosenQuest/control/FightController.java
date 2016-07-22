/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.model.Creature;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Character;
import java.util.Random;


/**
 *
 * @author Travis Harley
 */
public class FightController {
            
    public int rollDice(int sides) {
        int roll;
        Random rand = new Random();
        
        roll = rand.nextInt(sides) + 1;
        return roll;
    }
          
    public static void createFight(Character creature, Player player){
              
        while(creature.getHitpoints() > 0 || player.getHitpoints() > 0){
            
            // create getHitPoints
            int creatureAttack = 0;
            int playerAttack = 0;
            int creatureStrength = (int) creature.getStrength();
            int playerStrength = (int) player.getStrength();
                    
            // creature total attack
            creatureAttack = creatureStrength + 5;
            playerAttack = playerStrength + 5;
                      
            // compare who is higher
            if(creatureAttack > playerAttack){
                int playerHitpoints = (int) (player.getHitpoints() - creatureAttack);
                player.setHitpoints(playerHitpoints);
                System.out.println("Player was hit " + creatureAttack);
            }else{
                int creatureHitpoints = (int) (creature.getHitpoints() - playerAttack);
                creature.setHitpoints(creatureHitpoints);
                System.out.println("Creature was hit " + playerAttack);
            }   
        }
        // if hit < 0 declare winner
        if(creature.getHitpoints() == 0){
            System.out.println("You won!");
        }else{
            System.out.println("The Creature beat you!");
        }
    }
}
