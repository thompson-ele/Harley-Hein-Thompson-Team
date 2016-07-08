/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import byui.cit260.theChosenQuest.control.GameController;
import byui.cit260.theChosenQuest.model.Scene;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Travis Harley
 */
public class Locations implements Serializable {
    
    //attributes
    private double row;
    private double column;
    private boolean visited; 
    private Scene scene;
    private ArrayList<Actor> actors;
    
     private static Map createMap(){
        //create the map
        Map map = new Map(20, 20);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to location
        GameController.assignScenesToLocations(map, scenes);
        
        return map;
    }
     
    
    
     private static Scene[] createScenes(){

        Scene[] scenes = new Scene[Scene.SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("This is our description for the create scenes junk");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations! another description");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[Scene.SceneType.finish.ordinal()] = finishScene;

        Scene campScene = new Scene();
        campScene.setDescription("CampScene descriptions");
        campScene.setMapSymbol(" BY ");
        campScene.setBlocked(false);
        campScene.setTravelTime(600);
        scenes[Scene.SceneType.camp.ordinal()] = campScene;

        return scenes;
    }
      
    // constructor
    public Locations() {
    }
    
    // getter setters
    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    // equals and hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.visited);
        return hash;
    }

    // to string function
    @Override
    public String toString() {
        return "Locations{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locations other = (Locations) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        return Objects.equals(this.visited, other.visited);
    }

    void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
