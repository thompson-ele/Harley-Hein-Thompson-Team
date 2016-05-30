/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

/**
 *
 * @author Travis Harley
 */
public class InventoryControl {
    
    public int calcArmorLevel(int armorType){
        
        // input variables
        int armorStrength = armorType + 5; 
        
        if(armorType <= -1){
        
            System.out.println("There was an error, please try again");
            return -1;
        }
        
        if(armorType >= 5){
        
            System.out.println("Your armor increased by 5pts!");
            return armorStrength;
            
        }
        
        return armorStrength;
    
    }
    public int calcGoldAmount(int currentGold){
    
        //variables
        int totalGold = currentGold + 1; 
        
        if(currentGold < -1){
            
            System.out.println("You have 0 coins");
            return -1; 
        }
        
        if(currentGold >= 0){
            
            System.out.println("You have "+totalGold+" coins");
            return totalGold;
            
        }
        
        return currentGold;
    }
    public int calcMagicLevel(int currentMagic){
    
        //variables
        int totalMagic = currentMagic + 5;
        
        if(currentMagic < 1){
        
            System.out.println("You have no magic");
            return -1; 
        }
        
        if(currentMagic > 1){
        
            System.out.println("You have "+totalMagic+" coins");
            return totalMagic;
            
        }
        
        return currentMagic;
    }
    
    
}
