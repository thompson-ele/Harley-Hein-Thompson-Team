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
class InventoryView {
    
    private String menu; 
    
    public InventoryView(){
        this.menu= "\n"
                + "\n---------------"
                + "\nInventory Menu |"
                + "\nW - Weapons"
                + "\nA - Armor"
                + "\nO - Other Items"
                + "\nG - Gold"
                + "\nQ = Quit";
    }
    
    void displayInventoryView(){
        
        boolean done = false;
        do{
            //prompt for and get the players name
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q")) 
                return;
            
            //do the requested action then display the new view
            done = this.doAction(menuOption);
       
        } while (!done);
    }
    
    private boolean doAction(String choice) {
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

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value returned
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n"+this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trialing blanks
            
            if(value.length() < 1){
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        return value; // return the value entereds
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
