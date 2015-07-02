/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.ShipControl;
import byui.cit260.jedi.exceptions.ShipControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author geoffreywhetstone
 */
class ShipView extends View{
    public ShipView()  {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Ship:The Vendetta                         |"
            + "\n---------------------------------------------"
            + "\n Welcome to the Vendetta"
            + "\n Press 1 to leave current Location, Press"
            + "\n any other button to exit"
            + "\n---------------------------------------------");
     
}
        
 
         @Override
    public boolean doAction(Object obj){
        
        String playerInput = (String) obj;          
        char choice = playerInput.charAt(0);
        
        switch (choice) {
            case '1':
        {
            try {
                this.leavelocation();
            } catch (ShipControlException ex) {
                Logger.getLogger(ShipView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                this.display();
                break;
                    
        }
        return false;
    }

    private void leavelocation() throws ShipControlException {
        ShipControl shipControl = new ShipControl();
        shipControl.leaveLocation(); 
    }

    
    


    }
    

