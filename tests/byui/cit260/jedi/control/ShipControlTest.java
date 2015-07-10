/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.ShipControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class ShipControlTest {
    
    protected static final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected static final PrintWriter console = PathOfTheJedi.getOutFile();
    
    public ShipControlTest() {
    }

    /**
     * Test of leaveLocation method, of class ShipControl.
     * @throws byui.cit260.jedi.exceptions.ShipControlException
     */
    @Test
    public void testLeaveLocation() throws ShipControlException {
        console.println("leaveLocation");
        
        /*********************
         * Test Case #1
         *********************/
        
        console.println("\tTest Case #1");
        
        double liqHydro = 185.0;
        double tritium = 62.0;
        ShipControl instance = new ShipControl();
        double expResult = 246.0;
        double result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #2
         *********************/
        
        console.println("\tTest Case #2");
        
        liqHydro = 50.0;
        tritium = 75.0;
        expResult = -1.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #3
         *********************/
        
        console.println("\tTest Case #3");
        
        liqHydro = 100.0;
        tritium = 0.0;
        expResult = -1.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #4
         *********************/
        
        console.println("\tTest Case #4");
        
        liqHydro = 75.0;
        tritium = 50.0;
        expResult = -1.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #5
         *********************/
        
        console.println("\tTest Case #5");
        
        liqHydro = 200.0;
        tritium = 100.0;
        expResult = 266.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #6
         *********************/
        
        console.println("\tTest Case #6");
        
        liqHydro = 190.0;
        tritium = 64.0;
        expResult = 253.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
        
        /*********************
         * Test Case #7
         *********************/
        
        console.println("\tTest Case #7");
        
        liqHydro = 166.0;
        tritium = 55.0;
        expResult = 221.0;
        result = instance.leaveLocation();
        assertEquals(expResult, result, 0.0);
    }
    
}
