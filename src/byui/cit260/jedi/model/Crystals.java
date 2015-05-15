/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.model;

import java.util.Objects;

/**
 *
 * @author geoffreywhetstone
 */
public class Crystals {
    //class instance variables
    private String red;
    private String blue;
    private String green;
    private String purple;

    @Override
    public String toString() {
        return "Crystals{" + "red=" + red + ", blue=" + blue + ", green=" + green + ", purple=" + purple + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.red);
        hash = 41 * hash + Objects.hashCode(this.blue);
        hash = 41 * hash + Objects.hashCode(this.green);
        hash = 41 * hash + Objects.hashCode(this.purple);
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
        final Crystals other = (Crystals) obj;
        if (!Objects.equals(this.red, other.red)) {
            return false;
        }
        if (!Objects.equals(this.blue, other.blue)) {
            return false;
        }
        if (!Objects.equals(this.green, other.green)) {
            return false;
        }
        if (!Objects.equals(this.purple, other.purple)) {
            return false;
        }
        return true;
    }
    
    

    public Crystals() {
    }
    

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public String getPurple() {
        return purple;
    }

    public void setPurple(String purple) {
        this.purple = purple;
    }
    
    
    
    
}
