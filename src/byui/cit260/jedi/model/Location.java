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
public class Location {
    //class instance variables
    private String itemsAvailable;

    @Override
    public String toString() {
        return "Location{" + "itemsAvailable=" + itemsAvailable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.itemsAvailable);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.itemsAvailable, other.itemsAvailable)) {
            return false;
        }
        return true;
    }
    
    
    public Location() {
    }

    public String getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(String itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }
    
    
}
