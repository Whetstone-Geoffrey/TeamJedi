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
public class InventoryList {
    //class instance variables
    private String mandalorianMetal;
    private String synthCrystal;
    private String hologramTraining;

    public InventoryList() {
    }

    @Override
    public String toString() {
        return "inventoryList{" + "mandalorianMetal=" + mandalorianMetal + ", synthCrystal=" + synthCrystal + ", hologramTraining=" + hologramTraining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.mandalorianMetal);
        hash = 53 * hash + Objects.hashCode(this.synthCrystal);
        hash = 53 * hash + Objects.hashCode(this.hologramTraining);
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
        final InventoryList other = (InventoryList) obj;
        if (!Objects.equals(this.mandalorianMetal, other.mandalorianMetal)) {
            return false;
        }
        if (!Objects.equals(this.synthCrystal, other.synthCrystal)) {
            return false;
        }
        if (!Objects.equals(this.hologramTraining, other.hologramTraining)) {
            return false;
        }
        return true;
    }
    
    

    public String getMandalorianMetal() {
        return mandalorianMetal;
    }

    public void setMandalorianMetal(String mandalorianMetal) {
        this.mandalorianMetal = mandalorianMetal;
    }

    public String getSynthCrystal() {
        return synthCrystal;
    }

    public void setSynthCrystal(String synthCrystal) {
        this.synthCrystal = synthCrystal;
    }

    public String getHologramTraining() {
        return hologramTraining;
    }

    public void setHologramTraining(String hologramTraining) {
        this.hologramTraining = hologramTraining;
    }
    
    
    
}
