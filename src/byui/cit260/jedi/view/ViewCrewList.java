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
public class ViewCrewList {
    
    public ViewCrewList() {
            +("\n"
            + "\n---------------------------------------------"
            + "\n| Crew List                                 |"
            + "\n---------------------------------------------"
            + "\n1 - R4"
            + "\n2 - Pilot"
            + "\n3 - Ally"
            + "\n4 - Ally"
            + "\n5 - Previous Menu"
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
                this.Ally();
                break;
            case '6':
                //How to call the function from MainMenuView to return the the other menu
                this.display();
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        return true;
    
    }

    private void R4() {
        System.out.println("*** movement Function called ***");
    }

    private void Pilot() {
        System.out.println("*** movement Function called ***");
    }

    private void Ally() {
        System.out.println("*** movement Function called ***");
    }

    private void display() {
        System.out.println("*** movement Function called ***");
    }
    
}
