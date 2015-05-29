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
public class LocationControl {
  
    
    public double combatEnemy(double userHP, double enemyHP) {
      
        if(userHP > enemyHP) { //userHP is more than enemy so user wins
            double win = 1;
            return win;
        } 
        if(userHP < enemyHP) { //userHP is less than enemy so user loses
            double lose = -1;
            return lose;
        }
        double currentHP = userHP;
        double totalHP = currentHP - enemyHP;
        
        return totalHP;
            
    }
}
