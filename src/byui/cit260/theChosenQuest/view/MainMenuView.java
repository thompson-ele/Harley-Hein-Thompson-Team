/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.GameController;
import byui.cit260.theChosenQuest.exception.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
public class MainMenuView extends View {

    public MainMenuView(){
        super(    "\n"
                + "\n-----------------------------------"
                + "\n| Main Menu                       |"
                + "\n-----------------------------------"
                + "\nN - New Game"
                + "\nL - Load Game"
                + "\nQ - Quit"
                + "\n-----------------------------------");
        
    }
    
    public boolean doAction(String choice){
    
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "N": // create a new game
                this.startNewGame();
                break;
            case "G": //get and start and existing game
                this.startExistingGame();
                break;
            case "S": //get and start and existing game
                this.saveGame();
                break;
            case "L": // load the game
                this.loadGame();
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

    
    // NEED TO CHANGE THE EXCEPTION FOR THIS METHOD
    private void startNewGame() {
        try {
            // create a new game
            GameController.createNewGame(TheChosenQuest.getPlayer());
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
    }
    
    private void saveGame() {
    //prompt for and get the name of the file to save the game in
    this.console.println("\n\nEnter the file pat for file where the game"
                           + "is to be saved.");
    String filePath = this.getInput();
    
    try {
        //save the game to the specified file
        GameController.saveGame(TheChosenQuest.getCurrentGame(), filePath);
    }catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void loadGame() {
        System.out.println("\n Your game loaded and it's calling the function");
    }

    private void exitGame() {
        System.out.println("\n Good news, you just quit your game. Hope you saved it. It's just calling the function");
    }

    private void startSavedGame() {
    
    //promt for and get name of the file to save the game in
    this.console.println("\n\nEnter the file path for the file where the game " 
            + "is to be saved.");
    
    String filePath = this.getInput();
    
        try {
            //start a saved game
            GameController.getSavedGame(filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
            //display the game
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
    }
    
}
