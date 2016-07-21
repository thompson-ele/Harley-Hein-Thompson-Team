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
public class Location implements Serializable {

    //attributes
    private int row;
    private int column;
    private boolean visited;
    private Item item;
    private Character creature;

    // constructor
    public Location() {
    }

    // getter setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Character getCreature() {
        return creature;
    }

    public void setCreature(Character creature) {
        this.creature = creature;
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
        final Location other = (Location) obj;
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
