/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Travis Harley
 */
public enum Actor implements Serializable{
    
    dwarf("This man, you don't want to mess with. He'll mess you up"),
    human("Always looking for a way to monteize junk"),
    elf("Try his cookies, pointy and pretentious");
    
    private final String description;
    private final Point coordinates;

    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    //getter setters
    public String getDescription(){
        return description;
    }

    public Point getCoordinates(){
        return coordinates;
    }

}
