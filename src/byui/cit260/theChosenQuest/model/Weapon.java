/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;

/**
 *
 * @author ethompson
 */
public class Weapon extends Item implements Serializable {
    
    // class instance variables
    private int strengthBonus;
    private int dexterityBonus;

    public Weapon() {
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.strengthBonus;
        hash = 67 * hash + this.dexterityBonus;
        return hash;
    }

    @Override
    public String toString() {
        return "Weapon{" + "strengthBonus=" + strengthBonus + ", dexterityBonus=" + dexterityBonus + '}';
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
        final Weapon other = (Weapon) obj;
        if (this.strengthBonus != other.strengthBonus) {
            return false;
        }
        if (this.dexterityBonus != other.dexterityBonus) {
            return false;
        }
        return true;
    }
    
    
    
}
