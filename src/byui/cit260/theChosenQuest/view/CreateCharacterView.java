/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.CharacterControl;
import byui.cit260.theChosenQuest.model.Character;
import java.util.Scanner;

/**
 *
 * @author ethompson
 */

public class CreateCharacterView {
    // Class variables
    private final String promptMessage = "\nPlease enter your character's name:";
    
    // Class constructor
    public CreateCharacterView() {
        this.displayBanner();
    }
    
    public void displayBanner() {
        System.out.println(
                "\n"
                + "Before we start our adventure"
                + "\nlet's create your character"
                + "\n---------------------------");
    }
    
    void displayCreateCharacterView() {
        
       boolean done = false;
       do{
           //prompt for and get the players name
           String charactersName = this.getCharactersName();
           if (charactersName.toUpperCase().equals("Q"))
               return; //exit the game
           
           done = this.doAction(charactersName);
       } while(!done);  
    }

    private String getCharactersName() {
        
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

    private boolean doAction(String characterName){
        
        if(characterName.length() < 2){
            System.out.println("\nInvalid character name:"
                    + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Character character = CharacterControl.createCharacter(characterName);
        
        if(character == null){
            System.out.println("\nError creating the character.");
            return false;
        }
        
        //dislay next view
        this.displayNextView(character);
        
        return true; // yay! 
    }

    private void displayNextView(Character character) {
        System.out.println("\n--------------------------------"
                            + "\nYou have successfully created your character!"
                            + "\n Character Name: "
                            + character.getName()
                            + "\n---------------------------- "
        );
        
        //create next view object
        
        //display the next view
    }
}
