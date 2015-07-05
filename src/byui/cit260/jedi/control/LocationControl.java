/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.exceptions.LocationControlException;

/**
 *
 * @author geoffreywhetstone
 */
public class LocationControl {
  
    
    public double combatEnemy(double userHP, double enemyHP) 
                    throws LocationControlException {
        if(userHP > enemyHP) { //userHP is more than enemy so user wins
            throw new LocationControlException("User cannot win because "
                                            + "User has < Hit Points than Enemy "
                                            + "and is required to have > Hit Points than Enemy ");
            /*double win = 1;
            return win;*/
        } 
        if(userHP < enemyHP) { //userHP is less than enemy so user loses
            throw new LocationControlException("Enemy cannot win because "
                                            + "Enemy has < Hit Points than User "
                                            + "and is required to have > Hit Points than User ");
            /*double lose = -1;
            return lose;*/
        }
        double currentHP = userHP;
        double totalHP = currentHP - enemyHP;
        
        return totalHP;
            
    }
}
  