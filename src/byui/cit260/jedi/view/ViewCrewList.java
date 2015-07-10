/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

/**
 *
 * @author Moses
 */
public class ViewCrewList extends View{
    
    public ViewCrewList() {
            super("\n"
            + "\n---------------------------------------------"
            + "\n| Crew List                                 |"
            + "\n---------------------------------------------"
            + "\n1 - R4"
            + "\n2 - Pilot"
            + "\n3 - Ally"
            + "\n4 - Previous Menu"
            + "\n---------------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        
        String playerInput = (String) obj;      
        char choice = playerInput.charAt(0);
        
        switch (choice) {
            case '1':
                this.R4();
                break;
            case '2':
                this.Pilot();
                break;
            case '3':
                this.Ally();
                break;
            case '4':
                //How to call the function from MainMenuView to return the the other menu
                this.display();
                break;
            default:
                 this.console.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        return false;
    
    }

    private void R4() {
         this.console.println("*** R4 Function called ***");
    }

    private void Pilot() {
         this.console.println("*** Pilot Function called ***");
    }

    private void Ally() {
         this.console.println("*** Ally Function called ***");
    }

    
}
