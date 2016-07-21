/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.model.Player;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Ele Thompson
 */
public class CreatePlayerView extends View {

    Player player = TheChosenQuest.getPlayer();
    GameMenuView gameMenuView = new GameMenuView();
    
    public CreatePlayerView() {
        super( "\n"
            + "\n---------------------------------------"
            + "\n| Please choose your character\'s race |"
            + "\n---------------------------------------"
            + "\nD - Dwarf"
            + "\nE - Elf"
            + "\nH - Human"
            + "\nF - Halfling"
            + "\nQ - Quit Game"
            + "\n---------------------------------------");
    }

    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch(choice){
            case "D": //Dwarf
                this.choseDwarf();
                break;
            case "E": // Elf
                this.choseElf();
                break;
            case "H": // Human
                this.choseHuman();
                break;
            case "F": // Halfling
                this.choseHalfling();
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
    
    private void exitGame() {
        System.out.println("\nYou quit the game. Come back soon.");
    }

    private void successfulCreationMessage() {
        System.out.println("\nYou have successfully chosen your character"
                           + "\nto be a " + player.getRace() + "!"
                           + "\nBe sure to look at the map to start your quest!");
    }
    
    private void choseDwarf() {
        player.setRace("Dwarf");
        player.setHitpoints(20);
        player.setStrength(4);
        
        this.successfulCreationMessage();
        gameMenuView.display();
    }

    private void choseElf() {
        player.setRace("Elf");
        player.setHitpoints(20);
        player.setStrength(3);
        
        this.successfulCreationMessage();
        gameMenuView.display();
    }

    private void choseHuman() {
        player.setRace("Human");
        player.setHitpoints(20);
        player.setStrength(4);
        
        this.successfulCreationMessage();
        gameMenuView.display();
    }

    private void choseHalfling() {
        player.setRace("Halfling");
        player.setHitpoints(20);
        player.setStrength(2);
        
        this.successfulCreationMessage();
        gameMenuView.display();
    }
    
}
