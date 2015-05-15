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
public class Holograms {
    //class instance variables
    private String dualLightsaber;
    private String forceLightning;
    private String forceChoke;

    @Override
    public String toString() {
        return "Holograms{" + "dualLightsaber=" + dualLightsaber + ", forceLightning=" + forceLightning + ", forceChoke=" + forceChoke + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.dualLightsaber);
        hash = 67 * hash + Objects.hashCode(this.forceLightning);
        hash = 67 * hash + Objects.hashCode(this.forceChoke);
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
        final Holograms other = (Holograms) obj;
        if (!Objects.equals(this.dualLightsaber, other.dualLightsaber)) {
            return false;
        }
        if (!Objects.equals(this.forceLightning, other.forceLightning)) {
            return false;
        }
        if (!Objects.equals(this.forceChoke, other.forceChoke)) {
            return false;
        }
        return true;
    }
    
    

    public Holograms() {
    }
    
    

    public String getDualLightsaber() {
        return dualLightsaber;
    }

    public void setDualLightsaber(String dualLightsaber) {
        this.dualLightsaber = dualLightsaber;
    }

    public String getForceLightning() {
        return forceLightning;
    }

    public void setForceLightning(String forceLightning) {
        this.forceLightning = forceLightning;
    }

    public String getForceChoke() {
        return forceChoke;
    }

    public void setForceChoke(String forceChoke) {
        this.forceChoke = forceChoke;
    }
   
    
    
}
