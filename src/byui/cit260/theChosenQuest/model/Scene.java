/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Travis Harley
 */
public class Scene implements Serializable{
    
    //attributes
    private String description;
    private String locationIcon;
    private boolean blocked;
    private double travelTime;

    

    
    // List of SceneTypes
    public enum SceneType {
        desert,
        start,
        camp,
        finish,
        beach;
    }
    
    public void setMapSymbol(String symbol) {
        System.out.println("Stub function: Scene class, setMapSymbol() called");
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.beach.ordinal()]);
    }
    
    //constructor
    public Scene() {
    }
    
    //getter setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationIcon() {
        return locationIcon;
    }

    public void setLocationIcon(String locationIcon) {
        this.locationIcon = locationIcon;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.locationIcon);
        hash = 53 * hash + (this.blocked ? 1 : 0);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.locationIcon, other.locationIcon);
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", locationIcon=" + locationIcon + ", blocked=" + blocked + ", travelTime=" + travelTime + '}';
    }
    
    
    
}
