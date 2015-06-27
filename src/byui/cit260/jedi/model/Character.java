package byui.cit260.jedi.model;

import java.awt.Point;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geoffreywhetstone
 */
public enum Character {
    //class instance variables
    
    Cale("Main Character, Young Jedi seeking revenge for his family."),
    Romulous("The father of Cale, killed by the Sith for working against them in the Senate."),
    Syrena("The Sith Lord that was assigned to kill Cale's Family."),
    R4("The Droid that Romulous left for his son to help him become a Jedi.");
    
    
    //class instance variables need to be final.
    private final String description;
    private final Point coordinates;
    

    Character (String description) {
        this.description = description;
        coordinates = new Point(1,1);
}

public String getDescription(){
    return description;
}

public Point getCoordinates() {
    return coordinates;
}
}

   /* private double forceLevel;

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
*/
    
    
    
    

