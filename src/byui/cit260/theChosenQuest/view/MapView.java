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
public class MapView {
    
    private String menu;
    
    public MapView(){
        this.menu = "\n"
                + "\n------------------"
                + "\nMap |"
                + "\nF- Forward"
                + "\nL - Left"
                + "\nR - Right"
                + "\nB - Back"
                + "\nQ - Quit";
    }
    
    public void displayMapView(){
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
            case "F": // create a new game
                this.moveForward();
                break;
            case "L": // load the game
                this.moveLeft();
                break;
            case "R": // load the game
                this.moveRight();
                break;
            case "B": // load the game
                this.moveBack();
                break;
            case "Q": // quit it 
                this.exitMap();
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

    private void moveForward() {
        System.out.println("\nMove forward");
    }

    private void moveLeft() {
        System.out.println("\nMove Left");
    }

    private void moveRight() {
        System.out.println("\nMove Right");
    }

    private void moveBack() {
        System.out.println("\nMove Back");
    }

    private void exitMap() {
        System.out.println("\nExit map");
    }
    
    
}
