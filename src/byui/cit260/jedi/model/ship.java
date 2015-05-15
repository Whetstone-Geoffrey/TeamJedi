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
public class ship {
    //class instance variables
    private String continueMission;
    private String exitShip;
    private String workshop;
    private String attribute;

    public ship() {
    }

    @Override
    public String toString() {
        return "ship{" + "continueMission=" + continueMission + ", exitShip=" + exitShip + ", workshop=" + workshop + ", attribute=" + attribute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.continueMission);
        hash = 59 * hash + Objects.hashCode(this.exitShip);
        hash = 59 * hash + Objects.hashCode(this.workshop);
        hash = 59 * hash + Objects.hashCode(this.attribute);
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
        final ship other = (ship) obj;
        if (!Objects.equals(this.continueMission, other.continueMission)) {
            return false;
        }
        if (!Objects.equals(this.exitShip, other.exitShip)) {
            return false;
        }
        if (!Objects.equals(this.workshop, other.workshop)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
    

    public String getContinueMission() {
        return continueMission;
    }

    public void setContinueMission(String continueMission) {
        this.continueMission = continueMission;
    }

    public String getExitShip() {
        return exitShip;
    }

    public void setExitShip(String exitShip) {
        this.exitShip = exitShip;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    
    
}
