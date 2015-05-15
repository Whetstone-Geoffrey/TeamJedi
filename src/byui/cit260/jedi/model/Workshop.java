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
public class Workshop {
    //class instance variables
    private String lighsaberCrystal;
    private String lightsabeHilt;
    private String returnToShip;

    @Override
    public String toString() {
        return "Workshop{" + "lighsaberCrystal=" + lighsaberCrystal + ", lightsabeHilt=" + lightsabeHilt + ", returnToShip=" + returnToShip + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.lighsaberCrystal);
        hash = 53 * hash + Objects.hashCode(this.lightsabeHilt);
        hash = 53 * hash + Objects.hashCode(this.returnToShip);
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
        final Workshop other = (Workshop) obj;
        if (!Objects.equals(this.lighsaberCrystal, other.lighsaberCrystal)) {
            return false;
        }
        if (!Objects.equals(this.lightsabeHilt, other.lightsabeHilt)) {
            return false;
        }
        if (!Objects.equals(this.returnToShip, other.returnToShip)) {
            return false;
        }
        return true;
    }
    
    

    public Workshop() {
    }
    
    

    public String getLighsaberCrystal() {
        return lighsaberCrystal;
    }

    public void setLighsaberCrystal(String lighsaberCrystal) {
        this.lighsaberCrystal = lighsaberCrystal;
    }

    public String getLightsabeHilt() {
        return lightsabeHilt;
    }

    public void setLightsabeHilt(String lightsabeHilt) {
        this.lightsabeHilt = lightsabeHilt;
    }

    public String getReturnToShip() {
        return returnToShip;
    }

    public void setReturnToShip(String returnToShip) {
        this.returnToShip = returnToShip;
    }
    
    
    
}
