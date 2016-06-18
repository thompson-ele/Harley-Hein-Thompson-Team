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
