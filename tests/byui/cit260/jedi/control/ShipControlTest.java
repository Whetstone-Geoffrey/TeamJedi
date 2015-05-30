/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geoffreywhetstone
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of leaveLocation method, of class ShipControl.
     */
    @Test
    public void testLeaveLocation() {
        System.out.println("leaveLocation");
        
        /*********************
         * Test Case #1
         *********************/
        
        System.out.println("\tTest Case #1");
        
        double liqHydro = 185.0;
        double tritium = 62.0;
        ShipControl instance = new ShipControl();
        double expResult = 246.0;
        double result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #2
         *********************/
        
        System.out.println("\tTest Case #2");
        
        liqHydro = 50.0;
        tritium = 75.0;
        expResult = -1.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #3
         *********************/
        
        System.out.println("\tTest Case #3");
        
        liqHydro = 100.0;
        tritium = 0.0;
        expResult = -1.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #4
         *********************/
        
        System.out.println("\tTest Case #4");
        
        liqHydro = 75.0;
        tritium = 50.0;
        expResult = -1.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #5
         *********************/
        
        System.out.println("\tTest Case #5");
        
        liqHydro = 200.0;
        tritium = 100.0;
        expResult = 266.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #6
         *********************/
        
        System.out.println("\tTest Case #6");
        
        liqHydro = 190.0;
        tritium = 64.0;
        expResult = 253.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #7
         *********************/
        
        System.out.println("\tTest Case #7");
        
        liqHydro = 166.0;
        tritium = 55.0;
        expResult = 221.0;
        result = instance.leaveLocation(liqHydro, tritium);
        assertEquals(expResult, result, 0.0);
    }
    
}
