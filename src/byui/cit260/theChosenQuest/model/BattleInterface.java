/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;
/**
 *
 * @author rileyhein
 */
public class BattleInterface implements Serializable{
    
    //no attributes
    
    
   //functions
    public static void attack(){};
    public static void defend() {};
    public static void run() {};
    
    //constructor
    public BattleInterface() {
    }
    
    //to string

    @Override
    public String toString() {
        return "BattleInterface{" + '}';
    }
    
    
}
