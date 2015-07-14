/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class InventoryControl {
    
    protected final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected final PrintWriter console = PathOfTheJedi.getOutFile();
    
    
    double mandalorianMetal = 2;
    double synthCrystal = 4;
    double hologramTraining = 2;
    String newLightsaber;
    
    
    
    
    
    public String constructLightsaber() 
            throws InventoryControlException {
        
        if(mandalorianMetal > 2) {
            throw new InventoryControlException("Cannot create lightsaber because "
                                          + "Mandalorian Metal = " + mandalorianMetal + ", " 
                                          + "required to have a minimum of 2 Mandalorian Metal. ");
        }
        if(synthCrystal > 4) {
            throw new InventoryControlException("Cannot create lightsaber because "
                                          + "Synth Crystal = " + synthCrystal + ", " 
                                          + "required to have a minimum of 4 Synth Crystal. ");
        }
        
        double total = mandalorianMetal + synthCrystal;
        
        
        if(total > 6) {
            throw new InventoryControlException("Cannot create lightsaber because "
                                          + "Synth Crystal = " + synthCrystal + ", " 
                                          + "and Mandalorian Metal = " + mandalorianMetal + ", " 
                                          + "required to have a minimum of 6 Total. ");
        }
            this.console.println("Congratulations, You have created a new Lightsaber.");
        
            return newLightsaber;
            
        
        } 
    public double InventoryList(){
        this.console.println("You have " + mandalorianMetal + " Madalorian Mestal");
        this.console.println("You have " + synthCrystal + " Synth Crystal");
        this.console.println("You have " + hologramTraining + " Hologram Training");
        
        double newtotal = mandalorianMetal + synthCrystal + hologramTraining;
        return newtotal;
}
}
