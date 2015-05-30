/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

/**
 *
 * @author geoffreywhetstone
 */
public class ShipControl {
    
    public double leaveLocation(double liqHydro, double tritium)  {
    
        if(tritium < (Math.floor(liqHydro * .333))) {
            return -1;
        }
        
        double tritiumRatio = Math.floor(liqHydro * .333);
        
        double total= tritiumRatio + liqHydro;
        
        if(total < 220) {
            return -1;
        }
        
        if(tritium <= 0) {
            return -1;
        }
        
        return total;
        
        
}
    
}
