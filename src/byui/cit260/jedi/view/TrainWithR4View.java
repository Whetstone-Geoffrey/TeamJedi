/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.util.List;

/**
 *
 * @author Moses
 */
public class TrainWithR4View extends View {
    
        public TrainWithR4View() {
            super("\n"
            + "\n---------------------------------------------"
            + "\n| Train with R4                                 |"
            + "\n---------------------------------------------"
            + "\n1 - Lightsaber Use"
            + "\n2 - Physical Combat"
            + "\n3 - Force Push"
            + "\n4 - Defensive Actions"
            + "\n5 - Force Affinity"
            + "\n6 - Return to previous menu"
            + "\n---------------------------------------------");
        }
        
    @Override
    public boolean doAction(Object obj){
        
        String playerInput = (String) obj;          
        char choice = playerInput.charAt(0);
       
                        
            switch (choice) {
            case '1':
                this.lightSaberUse();
                break;
            case '2':
                this.physicalCombat();
                break;
            case '3':
                this.forcePush();
                break;
            case '4':
                this.defensiveActions();
                break;
            case '5':
                this.forceAffinity();
                break;
            case '6':
                this.display();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
            return false;
    }

    private void lightSaberUse() {
        System.out.println("*** Lightsaber Use Function called ***");
    }

    private void physicalCombat() {
        System.out.println("*** Physical Combat Function called ***");
    }

    private void forcePush() {
        System.out.println("*** Force Push Function called ***");
    }

    private void defensiveActions() {
        System.out.println("*** Defensive Actions Function called ***");
    }

    private void forceAffinity() {
        System.out.println("*** Force Affinity Function called ***");
    }


    
}