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
public class FightScreen {
    
    private String menu;
    
    public FightScreen(){
        this.menu = "\n"
                + "\n---------------"
                + "\nFight Options |"
                + "\nA - Attack"
                + "\nD - Defend"
                + "\nR - Run";
    }
    
    public void displayFightScreen(){
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
