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
public class MapView extends View{
    
    public MapView(){
        super("\n"
            + "\n-----------------------------------"
            + "\n| Map                             |"
            + "\n-----------------------------------"
            + "\nF- Forward"
            + "\nL - Left"
            + "\nR - Right"
            + "\nB - Back"
            + "\nQ - Quit"
            + "\n-----------------------------------");
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
