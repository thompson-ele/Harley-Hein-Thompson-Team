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
 * @author rileyhein
 */
public class Character implements Serializable{
    //attributes
    private String name;
    private double strength;
    private double dexterity;
    private double constitution;
    private double magic;
    private double charisma;
    private double hitpoints;
    private String equippedArmor;
    private String equippedWeapons;

    //constructor
    public Character() {
    }
    
    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getConstitution() {
        return constitution;
    }

    public void setConstitution(double constitution) {
        this.constitution = constitution;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getCharisma() {
        return charisma;
    }

    public void setCharisma(double charisma) {
        this.charisma = charisma;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(String equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public String getEquippedWeapons() {
        return equippedWeapons;
    }

    public void setEquippedWeapons(String equippedWeapons) {
        this.equippedWeapons = equippedWeapons;
    }
    
    //equals hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.dexterity) ^ (Double.doubleToLongBits(this.dexterity) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.constitution) ^ (Double.doubleToLongBits(this.constitution) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.magic) ^ (Double.doubleToLongBits(this.magic) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.charisma) ^ (Double.doubleToLongBits(this.charisma) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.hitpoints) ^ (Double.doubleToLongBits(this.hitpoints) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.equippedArmor);
        hash = 29 * hash + Objects.hashCode(this.equippedWeapons);
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dexterity) != Double.doubleToLongBits(other.dexterity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.constitution) != Double.doubleToLongBits(other.constitution)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magic) != Double.doubleToLongBits(other.magic)) {
            return false;
        }
        if (Double.doubleToLongBits(this.charisma) != Double.doubleToLongBits(other.charisma)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitpoints) != Double.doubleToLongBits(other.hitpoints)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.equippedArmor, other.equippedArmor)) {
            return false;
        }
        return true;
    }

    //to string function
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", strength=" + strength + ", dexterity=" + dexterity + ", constitution=" + constitution + ", magic=" + magic + ", charisma=" + charisma + ", hitpoints=" + hitpoints + ", equippedArmor=" + equippedArmor + ", equippedWeapons=" + equippedWeapons + '}';
    }
       
    
}
