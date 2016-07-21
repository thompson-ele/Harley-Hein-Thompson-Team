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
public class Creature extends Character implements Serializable{
    
    
    //class attributes
    private String creatureName;
    private String introductionText;
    private String defeatText;
    private String victoryText;
    
    //gettter setter
    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText;
    }

    public String getDefeatText() {
        return defeatText;
    }

    public void setDefeatText(String defeatText) {
        this.defeatText = defeatText;
    }

    public String getVictoryText() {
        return victoryText;
    }

    public void setVictoryText(String victoryText) {
        this.victoryText = victoryText;
    }
    
    //constructor
    public Creature() {
    }
    
    //equals hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.creatureName);
        hash = 67 * hash + Objects.hashCode(this.introductionText);
        hash = 67 * hash + Objects.hashCode(this.defeatText);
        hash = 67 * hash + Objects.hashCode(this.victoryText);
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
        final Creature other = (Creature) obj;
        if (!Objects.equals(this.creatureName, other.creatureName)) {
            return false;
        }
        if (!Objects.equals(this.introductionText, other.introductionText)) {
            return false;
        }
        if (!Objects.equals(this.defeatText, other.defeatText)) {
            return false;
        }
        if (!Objects.equals(this.victoryText, other.victoryText)) {
            return false;
        }
        return true;
    }
    
    
    //to string
    @Override
    public String toString() {
        return "Creature{" + "creatureName=" + creatureName + ", introductionText=" + introductionText + ", defeatText=" + defeatText + ", victoryText=" + victoryText + '}';
    }

    public void setCreatureName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
