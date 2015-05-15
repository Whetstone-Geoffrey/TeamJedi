package byui.cit260.jedi.model;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geoffreywhetstone
 */
public class Character {
    //class instance variables
    private double forceLevel;

    @Override
    public String toString() {
        return "Character{" + "forceLevel=" + forceLevel + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.forceLevel) ^ (Double.doubleToLongBits(this.forceLevel) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.forceLevel) != Double.doubleToLongBits(other.forceLevel)) {
            return false;
        }
        return true;
    }
    
    

    public Character() {
    }
    
    

    public double getForceLevel() {
        return forceLevel;
    }

    public void setForceLevel(double forceLevel) {
        this.forceLevel = forceLevel;
    }
    
    
    
    
}
