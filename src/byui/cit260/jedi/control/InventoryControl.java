/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.InventoryControlException;

/**
 *
 * @author geoffreywhetstone
 */
public class InventoryControl {
    
    double mandalorianMetal = 2;
    double synthCrystal = 4;
    double hologramTraining;
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
            System.out.println("Congratulations, You have created a new Lightsaber.");
        
            return newLightsaber;
            
        
        } 
         
}
