package thechosenquest;

// import view
import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.view.StartProgramView;
import byui.cit260.theChosenQuest.model.Player;
import byui.cit260.theChosenQuest.view.GetHelpView;

/**
 *
 * @author tharley, rhein, ethompson
 */
public class TheChosenQuest {

   private static Game currentGame = null;
   private static Player player = null;

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
        getHelpView.display();
        
        
    }
    
}
    
