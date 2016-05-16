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
public class DungeonTypeScene implements Serializable{
    
    //attributes
    private String objective;
    private double mathTrapOne;
    private double mathTropTwo;
    
    //constructor
    public DungeonTypeScene() {
    }
    
    //getter setters
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public double getMathTrapOne() {
        return mathTrapOne;
    }

    public void setMathTrapOne(double mathTrapOne) {
        this.mathTrapOne = mathTrapOne;
    }

    public double getMathTropTwo() {
        return mathTropTwo;
    }

    public void setMathTropTwo(double mathTropTwo) {
        this.mathTropTwo = mathTropTwo;
    }
    
    //equals hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.objective);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.mathTrapOne) ^ (Double.doubleToLongBits(this.mathTrapOne) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.mathTropTwo) ^ (Double.doubleToLongBits(this.mathTropTwo) >>> 32));
        return hash;
    }
    
    //to string function
    @Override
    public String toString() {
        return "DungeonTypeScene{" + "objective=" + objective + ", mathTrapOne=" + mathTrapOne + ", mathTropTwo=" + mathTropTwo + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DungeonTypeScene other = (DungeonTypeScene) obj;
        if (!Objects.equals(this.objective, other.objective)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mathTrapOne) != Double.doubleToLongBits(other.mathTrapOne)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mathTropTwo) != Double.doubleToLongBits(other.mathTropTwo)) {
            return false;
        }
        return true;
    }
    
    
    
}
