/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.LocationControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geoffreywhetstone
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }

    /**
     * Test of combatEnemy method, of class LocationControl.
     */
    @Test
    public void testCombatEnemy() throws LocationControlException {
        System.out.println("combatEnemy");
        
        /**********************
         * Test Case #1
         **********************/
        System.out.println("\tTest Case #1");
        
        double userHP = 100.0;
        double enemyHP = 75.0;
        LocationControl instance = new LocationControl();
        double expResult = 1.0;
        double result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    
        /**********************
         * Test Case #2
         **********************/
        System.out.println("\tTest Case #2");
        
        userHP = 50.0;
        enemyHP = 75.0;
   
        expResult = -1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.        
         
        /**********************
         * Test Case #3
         **********************/
        System.out.println("\tTest Case #3");
        
        userHP = 0.0;
        enemyHP = 50.0;
   
        expResult = -1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /**********************
         * Test Case #4
         **********************/
        System.out.println("\tTest Case #4");
        
        userHP = 0.0;
        enemyHP = 15.0;
   
        expResult = -1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /**********************
         * Test Case #5
         **********************/
        System.out.println("\tTest Case #5");
        
        userHP = 1.0;
        enemyHP = 99.0;
   
        expResult = -1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /**********************
         * Test Case #6
         **********************/
        System.out.println("\tTest Case #6");
        
        userHP = 50.0;
        enemyHP = 1.0;
   
        expResult = 1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        /**********************
         * Test Case #7
         **********************/
        System.out.println("\tTest Case #7");
        
        userHP = 100.0;
        enemyHP = 99.0;
   
        expResult = 1.0;
        result = instance.combatEnemy(userHP, enemyHP);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
