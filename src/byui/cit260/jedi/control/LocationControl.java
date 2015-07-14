/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.LocationControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class LocationControl {
  
    protected final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected final PrintWriter console = PathOfTheJedi.getOutFile();
    
    public double combatEnemy() 
                  
            throws LocationControlException {
        
        double userHP = 100;
        double enemyHP = 75;
        if(userHP < enemyHP) { //userHP is more than enemy so user wins
            throw new LocationControlException("User cannot win because "
                                            + "User has < Hit Points than Enemy "
                                            + "and is required to have > Hit Points than Enemy ");

        } 
        
        double currentHP = userHP;
        double totalHP = currentHP - enemyHP;
        this.console.println("You are victorious. You current HP = " + totalHP);
        
        return totalHP;
            
    }
}
  