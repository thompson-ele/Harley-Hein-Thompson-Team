/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.view;

import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Inventory;
import byui.cit260.theChosenQuest.model.Item;
import java.util.Scanner;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
class InventoryView extends View{
    
    public InventoryView(){
        super("\n"
            + "\n-----------------------------------"
            + "\n| Inventory Menu                  |"
            + "\n-----------------------------------"
            + "\nW - Weapons"
            + "\nA - Armor"
            + "\nO - Other Items"
            + "\nG - Gold"
            + "\nQ = Quit"
            + "\n-----------------------------------");
    }
    
    
    private void viewInventory(){
        // NEED TO CHANGE
        StringBuilder line;
        Game game = TheChosenQuest.getCurrentGame();
        Item[] inventory = game.getInventory();
        
        System.out.println("\n    LIST OF INNVENTORY ITEMS");
        line = new StringBuilder("                  ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        // for each inventory item
        for (Item item : inventory) {
            line = new StringBuilder("               ");
            line.insert(0, item.getDescription());
            //line.insert(23, item.getRequiredAmount());
            //line.insert(33, item.getQuantityInStock());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
        
    }
    
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();// convert choice to upper case
        
        switch(choice){
            case "W":
                this.displayWeapons();
                break;
            case "A":
                this.displayArmor();
                break;
            case "O":
                this.displayOtherItems();
                break;
            case "G":
                this.displayGold();
                break;
            case "Q":
                this.exitMenu();
                break;
            default:
                 System.out.println("\n**** Invalid. Please Try again.");
                 break;
        }
        
        return false;
    }

    private void displayWeapons() {
        System.out.println("\nYou have:"
                + "\n-Sword"
                + "\n-NunChucks");
    }

    private void displayArmor() {
       System.out.println("\nYou currently have the basic armor structure.");
    }

    private void displayOtherItems() {
        System.out.println("\nYou currently do not have any other items. Check back again.");
    }

    private void displayGold() {
        System.out.println("\nGold: 0");
    }

    private void exitMenu() {
        System.out.println("\nYou closed your inventory menu");
    }

    
    
    
}
