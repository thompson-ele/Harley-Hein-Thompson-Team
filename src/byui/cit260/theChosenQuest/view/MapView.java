/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.control.MovementController;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

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
            + "\nN - North"
            + "\nE - East"
            + "\nS - South"
            + "\nW - West"
            + "\nQ - Quit"
            + "\n-----------------------------------");
    }
       
    public boolean doAction(String choice){
    
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "N": // create a new game
                this.moveNorth();
                break;
            case "E": // load the game
                this.moveEast();
                break;
            case "S": // load the game
                this.moveSouth();
                break;
            case "W": // load the game
                this.moveWest();
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
    
    private void moveNorth() {
        MovementController mc = new MovementController();
        mc.moveNorth(TheChosenQuest.getCurrentGame());
    }
    
    private void moveEast() {
        MovementController mc = new MovementController();
        mc.moveEast(TheChosenQuest.getCurrentGame());
    }
    
    private void moveSouth() {
        MovementController mc = new MovementController();
        mc.moveSouth(TheChosenQuest.getCurrentGame());
    }
    
    private void moveWest() {
        MovementController mc = new MovementController();
        mc.moveWest(TheChosenQuest.getCurrentGame());
    }

    private void exitMap() {
        System.out.println("\nExit map");
    }
    
    
}
