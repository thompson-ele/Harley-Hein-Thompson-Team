/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;
import java.util.Objects;
import thechosenquest.TheChosenQuest;

/**
 *
 * @author Travis Harley
 */
public class Map implements Serializable {

    // variables 
    private int rowCount;
    private int columnCount;
    private String locationsVisited;
    private Location[][] locations;
    private String description;

    // constructor
    public Map() {
        this.description = "\nThis is the map, know it well";
        this.rowCount = 0;
        this.columnCount = 0;
    }

    public Map(int rowCount, int columnCount) {

        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of rows columns must be > 0");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;

        //create 2d array for location objects
        this.locations = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {

                //create and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the location object to the current position in array
                locations[row][column] = location;
            }

        }
    }
    
    public Location getLocation(int row, int col) {
        return locations[row][col];
    }
    
    public String getMapString() {
        
        String rtn = "";
        
        for (int row = 0; row < rowCount; row++) {
            rtn += "\n";
            for (int column = 0; column < columnCount; column++) {
                // Check if it's the player's current location                
                if(locations[row][column] == TheChosenQuest.getPlayer().getLocation()) {
                    rtn += "O\t";
                } else if(locations[row][column].getItem() != null) {
                    rtn += "I\t";
                } else if(locations[row][column].getCreature() != null) {
                    rtn += "C\t";
                } else{
                     // If it's not the player's current location, output an O or a V if it's a visited location
                    rtn += locations[row][column].getVisited() ? "V\t" : "X\t" ;
                }
            }
        }
     
        return rtn;
    }
    
    // getter setters
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public String getLocationsVisited() {
        return locationsVisited;
    }

    public void setLocationsVisited(String locationsVisited) {
        this.locationsVisited = locationsVisited;
    }

    // eqauals hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.locationsVisited);
        return hash;
    }

    // toString functionf
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", locationsVisited=" + locationsVisited + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (!Objects.equals(this.locationsVisited, other.locationsVisited)) {
            return false;
        }
        return true;
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
