/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.model;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author ethompson
 */
public class Armor extends Item implements Serializable {
    
    // class instance variables
    private int baseValue;
    private int dexterityBonus;

    public Armor() {
    }

    public int getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.baseValue;
        hash = 67 * hash + this.dexterityBonus;
        return hash;
    }
    private static final Logger LOG = Logger.getLogger(Armor.class.getName());

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
        final Armor other = (Armor) obj;
        if (this.baseValue != other.baseValue) {
            return false;
        }
        if (this.dexterityBonus != other.dexterityBonus) {
            return false;
        }
        return true;
    }
    
    
}
