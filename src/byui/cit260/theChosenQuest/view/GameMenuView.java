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
public class GameMenuView {

   private String menu;
    
    public GameMenuView() {
        this.menu =   "\n"
                    + "\n-------------------"
                    + "\nGame Menu |"
                    + "\nM - Map"
                    + "\nI - Inventory"
                    + "\nC - Character Sheet"
                    + "\nH - Help Menu"
                    + "\nF - Fight Screen"
                    + "\nS - Save Game"
                    + "\nQ - Quit Game";
    }

    public void displayGameMenuView() {
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
            case "M": // create a new game
                this.displayMap();
                break;
            case "I": // load the game
                this.inventoryMenu();
                break;
            case "C": // load the game
                this.displayCharacterSheet();
                break;
            case "H": // load the game
                this.helpMenu();
                break;
            case "F": // load the game
                this.fightScreen();
                break;
            case "S": // load the game
                this.saveGame();
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
    
    private void displayMap() {
        // display the map
        System.out.println("MAP OF THE LAND\n" 
               + "\n"
               + "            A       B       C       D       E\n"
               + "        -----------------------------------------\n"
               + "        |       |       |       |       |       |\n"
               + "    1   |   1   |   2   |   3   |   4   |   5   |\n"
               + "        |       |       |       |       |       |\n"
               + "        -----------------------------------------\n"
               + "        |       |       |       |       |       |\n"
               + "    2   |   6   |   7   |   8   |   9   |   10  |\n"
               + "        |       |       |       |       |       |\n"
               + "        -----------------------------------------\n"
               + "        |       |       |       |       |       |\n"
               + "    3   |   11  |   12  |   13  |   14  |   15  |\n"
               + "        |       |       |       |       |       |\n"
               + "        -----------------------------------------\n"
               + "        |       |       |       |       |       |\n"
               + "    4   |   16  |   17  |   18  |   19  |   20  |\n"
               + "        |       |       |       |       |       |\n"
               + "        -----------------------------------------\n"
               + "        |       |       |       |       |       |\n"
               + "    5   |   21  |   22  |   23  |   24  |   25  |\n"
               + "        |       |       |       |       |       |\n"
               + "        -----------------------------------------\n"
       );
        
        //display map menu
        MapView mapView = new MapView();
        mapView.displayMapView();
    }

    private void inventoryMenu() {
        //display the invnetory menu
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }

    private void displayCharacterSheet() {
        System.out.println("\nDisplay charactersheet has been called");
    }
    
    private void helpMenu() {
        //call the help menu
        GetHelpView getHelpView = new GetHelpView();
        getHelpView.displayGetHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\nYour game has saved!");
    }

    private void exitGame() {
        System.out.println("\nYou quit the game. Come back soon.");
    }

    private void fightScreen() {
        //display fight sreen
        FightScreen fightScreen = new FightScreen();
        fightScreen.displayFightScreen();
    }
   
}
