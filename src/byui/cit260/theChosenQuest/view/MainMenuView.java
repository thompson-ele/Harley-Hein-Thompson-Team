/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.GameController;
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

    private void startNewGame() {
        
        GameController.createNewGame(TheChosenQuest.getPlayer());
        
        //display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
    }

    private void loadGame() {
        System.out.println("\n Your game loaded and it's calling the function");
    }

    private void exitGame() {
        System.out.println("\n Good news, you just quit your game. Hope you saved it. It's just calling the function");
    }
}
