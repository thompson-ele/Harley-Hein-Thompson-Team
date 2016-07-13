/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.control;

import byui.cit260.theChosenQuest.model.Game;
import byui.cit260.theChosenQuest.model.Location;
import byui.cit260.theChosenQuest.model.Map;
import byui.cit260.theChosenQuest.model.Player;

/**
 *
 * @author Daniel
 */
public class MovementController {

    public boolean moveNorth(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == 0) {
            return false;
        }

        int currentCol = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;

        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);

        return true;
    }

    public boolean moveEast(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == map.getColumnCount() - 1) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() + 1));

        return true;
    }

    public boolean moveSouth(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getRow() == map.getRowCount() - 1) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumn()));

        return true;
    }

    public boolean moveWest(Game game) {

        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();

        if (currentLocation.getColumn() == 0) {
            return false;
        }

        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() - 1));

        return true;
    }
}
