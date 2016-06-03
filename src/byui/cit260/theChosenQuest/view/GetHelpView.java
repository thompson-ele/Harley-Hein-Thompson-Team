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
public class GetHelpView {
    
    private String menu;
    
    public GetHelpView(){
        this.menu = "\n"
                    + "\n---------------------"
                    + "\n Game Help Menu |"
                    + "\nG - What is the goal of the game?"
                    + "\nM - How to move"
                    + "\nQ - Quit Menu"
                    + "\n---------------------";
    }
    
    public void displayGetHelpMenuView() {
        
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
