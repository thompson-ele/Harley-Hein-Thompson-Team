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
public class Gold extends Item implements Serializable {
    
    // class instance variables
    private int amount;

    public Gold() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.amount;
        return hash;
    }

    @Override
    public String toString() {
        return "Gold{" + "amount=" + amount + '}';
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
        final Gold other = (Gold) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }
    
        
}
