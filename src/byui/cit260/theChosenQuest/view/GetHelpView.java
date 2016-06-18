/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import java.util.Scanner;

/**
 *
 * @author Travis Harley
 */
public class GetHelpView extends View{

    public GetHelpView(){
        super( "\n"
            + "\n-----------------------------------"
            + "\n| Help Menu                        |"
            + "\n-----------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nQ - Quit Menu"
            + "\n-----------------------------------");
    }
    
    public boolean doAction(String choice){
    
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "G": // create a new game
                this.gameGoal();
                break;
            case "M": // load the game
                this.gameControls();
                break;
            case "Q": // quit it 
                this.exitGame();
                break;
            default:
                System.out.println("\n****** Invalid selection *** TRY AGAIN!!!");
                break;
        }
        return false;
    }

    private void gameGoal() {
        System.out.println("\n gamegoal function called");
    }

    private void gameControls() {
        System.out.println("\n gameControls function called");
    }

    private void exitGame() {
        System.out.println("\n exitGame function called");
    }
    
}
