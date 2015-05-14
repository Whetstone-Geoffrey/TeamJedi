/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.model;

import java.util.Objects;

/**
 *
 * @author Moses
 */
public class Trainings {
        //class instance variables
        private String  lightSaberUse;
        private String combat;
        private String forcePush;
        private String forceAffinity;
        private String returnToShip;
        private String useHologram;

    @Override
    public String toString() {
        return "Trainings{" + "lightSaberUse=" + lightSaberUse + ", combat=" + combat + ", forcePush=" + forcePush + ", forceAffinity=" + forceAffinity + ", returnToShip=" + returnToShip + ", useHologram=" + useHologram + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.lightSaberUse);
        hash = 47 * hash + Objects.hashCode(this.combat);
        hash = 47 * hash + Objects.hashCode(this.forcePush);
        hash = 47 * hash + Objects.hashCode(this.forceAffinity);
        hash = 47 * hash + Objects.hashCode(this.returnToShip);
        hash = 47 * hash + Objects.hashCode(this.useHologram);
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
        final Trainings other = (Trainings) obj;
        if (!Objects.equals(this.lightSaberUse, other.lightSaberUse)) {
            return false;
        }
        if (!Objects.equals(this.combat, other.combat)) {
            return false;
        }
        if (!Objects.equals(this.forceAffinity, other.forceAffinity)) {
            return false;
        }
        if (!Objects.equals(this.returnToShip, other.returnToShip)) {
            return false;
        }
        if (!Objects.equals(this.useHologram, other.useHologram)) {
            return false;
        }
        return true;
    }
        
        

    public Trainings() {
    }
        
        
    public String getLightSaberUse() {
        return lightSaberUse;
    }

    public void setLightSaberUse(String lightSaberUse) {
        this.lightSaberUse = lightSaberUse;
    }

    public String getCombat() {
        return combat;
    }

    public void setCombat(String combat) {
        this.combat = combat;
    }

    public String getForcePush() {
        return forcePush;
    }

    public void setForcePush(String forcePush) {
        this.forcePush = forcePush;
    }

    public String getForceAffinity() {
        return forceAffinity;
    }

    public void setForceAffinity(String forceAffinity) {
        this.forceAffinity = forceAffinity;
    }

    public String getReturnToShip() {
        return returnToShip;
    }

    public void setReturnToShip(String returnToShip) {
        this.returnToShip = returnToShip;
    }

    public String getUseHologram() {
        return useHologram;
    }

    public void setUseHologram(String useHologram) {
        this.useHologram = useHologram;
       
    }
        
        
    
}
