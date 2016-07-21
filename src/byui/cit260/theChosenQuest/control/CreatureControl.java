/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

/**
 *
 * @author rileyhein
 */
public class CreatureControl {
    
    public int getAttack (int weaponValue, int strengthValue, int diceRoll){
        
        //Variables
        int attackHit = weaponValue + strengthValue + diceRoll;
        
        if(strengthValue < 0){
            
            System.out.println("The attack missed.");
                    return -1;
        }
        
        if(strengthValue >= 1){
            
            System.out.println("You have" +" " + attackHit);
                    return attackHit;
        }
        return attackHit; 
   
    }
    
    public int getDefense(int armorValue, int diceRoll){
        
        //Variables
        int getDefense = armorValue + diceRoll;
        
        if(armorValue < 0){
        
            System.out.println("Armor is gone!");
            return -1;
            
         }
            
        if(armorValue > 1){
            
            System.out.println("getDefense");
            return armorValue;
        }
    return armorValue;
    
    }
        
        
    public int getHP (int constitutionValue, int getDefense){
    
        //Variables
        int getHP = constitutionValue - getDefense;

        if(getHP < 0){

            System.out.println("You Died!");
            return -1;
        }


        if(getHP >= 1){

            System.out.println("getHP");
            return getHP;
        }
        
        return getHP;
    }
    
}

