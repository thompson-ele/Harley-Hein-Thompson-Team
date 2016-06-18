/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import java.util.Scanner;

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
    
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "A": // create a new game
                this.attack();
                break;
            case "D": // load the game
                this.defend();
                break;
            case "R": // load the game
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
        System.out.println("\nCalling run function");
    }
    
    
}
