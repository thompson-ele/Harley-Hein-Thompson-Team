/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.GameController;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
class MainMenuView {

    private String menu;

    
    public MainMenuView(){
        this.menu = "\n"
                   + "\n-------------------------"
                   + "\n Main Menu |"
                   + "\nN - New Game"
                   + "\nL - Load Game"
                   + "\nQ - Quit";
        
    }
    
    void displayMainMenuView() {
        
        boolean done = false; 
        do {
            //promot for and get players name
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q")) // user wants to quit
                return;
            
            // do the requested action and display the new view
            done = this.doAction(menuOption);
            
        } while (!done);
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

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keybaord
        String value = ""; // value to be returned
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n"+this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if(value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop pls
        }
        return value; // reutnr hte value entered
    }

    private void startNewGame() {
        
        GameController.createNewGame(TheChosenQuest.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadGame() {
        
        System.out.println("\n Your game loaded AKA it's calling the function");
    }

    private void exitGame() {
        System.out.println("\n Good news, you just quit your game. Hope you saved it. It's just calling the function");
    }
 

}
