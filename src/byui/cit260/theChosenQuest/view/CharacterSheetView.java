/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.model.Player;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;
/**
 *
 * @author Ele Thompson
 */
public class CharacterSheetView extends View {

    Player player = TheChosenQuest.getPlayer();
    GameMenuView gameMenuView = new GameMenuView();
    
    // Players stats
    String race = "You are a: " + player.getRace();
    String health = "Your remaining hitpoints are: " + player.getHitpoints();
    String strength = "Strength Level: " + player.getStrength();
    
    public CharacterSheetView() {
        // Using System.out.print() instead of super()
        // returns a NULL but I'm not sure why
        System.out.print( "\n"
            + "\n-----------------------------------"
            + "\n| Character Sheet                 |"
            + "\n-----------------------------------"
            + "\n" + race
            + "\n" + health
            + "\n" + strength
            + "\nB - Back to main menu"
            + "\n-----------------------------------");
    }

    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice) {
            case "B": // back to main menu
                gameMenuView.display();
                break;
            default:
                System.out.println("\n****** Invalid selection *** TRY AGAIN!!!");
                break;
        }
        
        return false;
    }

    private void exitGame() {
        System.out.println("\nYou quit the game. Come back soon.");
    }
    
}
