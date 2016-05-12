/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thechosenquest;

import byui.cit260.theChosenQuest.model.Player;

/**
 *
 * @author tharley
 */
public class TheChosenQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne= new Player();
        
        playerOne.setName("Testing The Tester");
        playerOne.setPlayerClass("upper-middle class");
        playerOne.setRace("Dwarf");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
