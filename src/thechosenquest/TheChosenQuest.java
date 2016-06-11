package thechosenquest;

// import view
import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.view.StartProgramView;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.view.GetHelpView;
import byui.cit260.theChosenQuest.model.Character;

/**
 *
 * @author tharley, rhein, ethompson
 */
public class TheChosenQuest {

   private static Game currentGame = null;
   private static Player player = null;
   private static Character hero = null;

    public static Character getHero() {
        return hero;
    }

    public static void setHero(Character hero) {
        TheChosenQuest.hero = hero;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheChosenQuest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheChosenQuest.player = player;
    }
   
   
   
    public static void main(String[] args) {
        
        //create StartProgramView and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        GetHelpView getHelpView = new GetHelpView();
        getHelpView.displayGetHelpMenuView();
        
    }
    
}
    
