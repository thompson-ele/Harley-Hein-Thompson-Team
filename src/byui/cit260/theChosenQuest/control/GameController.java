/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.view.GameMenuView;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
public class GameController {

    public static Player createPlayer(String name) {
        
        if(name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        TheChosenQuest.setPlayer(player); //save the player
        
        return player;
        
    }

    public static void createNewGame(Player player) {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
    public int createGame(int numberOfGames){
        
        //variables
        int gameFile = 1;
        
        if(numberOfGames <= 0){
            
            System.out.println("Start new game");
            return -1;
        }
        
        if(numberOfGames >= 1){
            
            System.out.println("Load game");
            return gameFile;
        }
        
        return gameFile;
    }
    
}
