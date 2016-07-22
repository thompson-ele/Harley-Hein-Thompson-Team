/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.FightController;
import byui.cit260.theChosenQuest.model.Location;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.model.Character;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Riley Hein
 */
public class FightScreen extends View {
    
    public FightScreen(){
        super("\n"
                + "\n-----------------------------------"
                + "\n| Fight Options                   |"
                + "\n-----------------------------------"
                + "\nA - Attack"
                + "\nD - Defend"
                + "\nR - Run"
                + "\n-----------------------------------");
    }
     
    public boolean doAction(String choice){
    
        Player player = TheChosenQuest.getPlayer();
        Location playerLocation = player.getLocation();
        Character creature = playerLocation.getCreature();
        FightController fight = new FightController();
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "A": // attack
                fight.createFight(creature, player);
                break;
            case "D": // defend
                this.defend();
                break;
            case "R": // run
                this.runFight();
                break;
            default:
                System.out.println("\n****** Invalid selection *** TRY AGAIN!!!");
                break;
        }
        
        return false;
    }

    private void attack() {
        System.out.println("\nCalling attack function");
        
       
    }

    private void defend() {
        System.out.println("\nCalling run function");
    }

    private void runFight() {
        System.out.println("\nYou got away safely!");
        GameMenuView mainMenu = new GameMenuView();
        mainMenu.display();
    }

    private void getCreature() {
        
    }

    private void getPlayer() {
        
    }
   
    
}
