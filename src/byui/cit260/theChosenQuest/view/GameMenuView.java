/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.MapController;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super( "\n"
            + "\n-----------------------------------"
            + "\n| Game Menu                       |"
            + "\n-----------------------------------"
            + "\nM - Map"
            + "\nI - Inventory"
            + "\nC - Character Sheet"
            + "\nH - Help Menu"
            + "\nF - Fight Screen"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n-----------------------------------");
    }

    public boolean doAction(String choice){
    
        MapController map = new MapController();
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "M": // create a new game
                map.displayMap();
                break;
            case "I": // load the game
                this.inventoryMenu();
                break;
            case "C": // load the game
                this.displayCharacterSheet();
                break;
            case "H": // load the game
                this.helpMenu();
                break;
            case "F": // load the game
                this.fightScreen();
                break;
            case "S": // load the game
                this.saveGame();
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

    private void inventoryMenu() {
        //display the invnetory menu
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void displayCharacterSheet() {
        CharacterSheetView characterSheet = new CharacterSheetView();
        characterSheet.display();
    }
    
    private void helpMenu() {
        //call the help menu
        GetHelpView getHelpView = new GetHelpView();
        getHelpView.display();
    }

    private void saveGame() {
        System.out.println("\nYour game has saved!");
    }

    private void exitGame() {
        System.out.println("\nYou quit the game. Come back soon.");
    }

    private void fightScreen() {
        //display fight sreen
        FightScreen fightScreen = new FightScreen();
        fightScreen.display();
    }
   
}
