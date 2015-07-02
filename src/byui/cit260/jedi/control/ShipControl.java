/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.ShipControlException;

/**
 *
 * @author geoffreywhetstone
 */
public class ShipControl {   
        
    public double leaveLocation()  
                throws ShipControlException {
        
        double liqHydro = 220;
        double tritium = 75;
        if(tritium < (Math.floor(liqHydro * .333))) {
            throw new ShipControlException("Cannot leave location because "
                                          + "Tritium = " + tritium + ", " 
                                          + "Liquid Hydrogen = " + liqHydro + ", "
                                          + "required total Tritium + Liquid Hydrogen > 220 "
                                          + "required Tritium <= 0 ");
            //return -1;
        }
        
        double tritiumRatio = Math.floor(liqHydro * .333);
        
        double total= tritiumRatio + liqHydro;
        
        if(total < 220) {
            throw new ShipControlException("Cannot leave location because "
                                          + "Tritium = " + tritium + ", " 
                                          + "Liquid Hydrogen = " + liqHydro + ", "
                                          + "required total Tritium + Liquid Hydrogen > 220 ");
            //return -1;
        }
        
        if(tritium <= 0) {
            throw new ShipControlException("Cannot leave location because "
                                          + "Tritium = " + tritium + ", " 
                                          + "Liquid Hydrogen = " + liqHydro + ", "
                                          + "required Tritium <= 0 ");
            //return -1;
        }
        
        System.out.println("Congratulations, you have enough fuel to take off Required: 220 You have: " + total);

        return total;
        
        

}
    
    
}
