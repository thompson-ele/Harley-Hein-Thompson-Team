/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.GameController;
import byui.cit260.theChosenQuest.model.Player;
import java.util.Scanner;

/**
 *
 * @author Travis Harley
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
        // promptMessage = 'Please enter your name'
        this.promptMessage = "\nPlease enter your name: ";
        
        // display the banner when view is created
        this.displayBanner();  
    }
    
    public void displayBanner(){
        
        System.out.println(
                " _____ _           ___ _                     _       ___              _" + "\n" +
                "|_   _| |_  ___   / __| |_  ___ ___ ___ _ _ ( )___  / _ \\ _  _ ___ __| |_" + "\n" +
                "  | | | ' \\/ -_) | (__| ' \\/ _ (_-</ -_) ' \\|/(_-< | (_) | || / -_|_-<  _|" + "\n" +
                "  |_| |_||_\\___|  \\___|_||_\\___/__/\\___|_||_| /__/  \\__\\_\\\\_,_\\___/__/\\__|" + "\n" +
                "\n"
                +"\nWelcome to The Chosen's Quest! As the chosen one you will need"
                +"\nto rid this world of monster\'s. Defeat all of them to win the game!"
                +"\nThere will also be items to help you on your quest."
        );
    }

    public void displayStartProgramView() {
        
       boolean done = false;
       do{
           //prompt for and get the players name
           String playersName = this.getPlayersName();
           if (playersName.toUpperCase().equals("Q"))
               return; //exit the game
           
           done = this.doAction(playersName);
       } while(!done);  
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keybaord
        String value = ""; // value to be returned
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n"+this.promptMessage);
            
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

    private boolean doAction(String playersName){
        
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name:"
                    + "\nThe name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameController.createPlayer(playersName);
        
        if(player == null){
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //dislay next view
        this.displayNextView(player);
        
        return true; // yay! 
    }

    private void displayNextView(Player player) {
        System.out.println("\n-----------------------------------"
                            + "\nWelcome to the game "+player.getName()
                            + "\nWe hope you have a lot of fun!"
                            + "\n-----------------------------------"
        );
        

        //create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //display the main menu view
        mainMenuView.display();
    }
    
}
