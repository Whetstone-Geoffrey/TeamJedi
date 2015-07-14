/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.GameControl;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class GettingHelpView extends View {
    
    public GettingHelpView() {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Getting Help                              |"
            + "\n---------------------------------------------"
            + "\n1 - Movement"
            + "\n2 - Goal of the Game"
            + "\n3 - Battle Events"
            + "\n4 - How the Ship Works"
            + "\n5 - Credits"
            + "\n6 - Previous Menu"
            + "\n---------------------------------------------");
            
    }
    @Override
    public boolean doAction(Object obj) {
        
        String playerInput = (String) obj;      
        char choice = playerInput.charAt(0);
        
        switch (choice) {
            case '1':
                this.movement();
                break;
            case '2':
                this.goalOfTheGame();
                break;
            case '3':
                this.battleEvents();
                break;
            case '4':
                this.howTheShipWorks();
                break;
            case '5':
                this.credits();
                break;
            case '7':
                this.inventoryReport();
                break;
            case '6':
                //How to call the function from MainMenuView to return the the other menu
                this.returnToPrevious();
                break;
            default:
                ErrorView.display("GettingHelpView",
                         "*** Invalid selection *** Try Again");                      
                break;
                    
        }
        return false;
    
    }

    private void movement() {
        this.console.println("*** movement Function called ***"); 
    }
    
    private void goalOfTheGame() {
        this.console.println("*** goalOfTheGame Function called ***"); 
    }

    private void battleEvents() {
        this.console.println("*** battleEvents Function called ***"); 
    }

    private void howTheShipWorks() {
        this.console.println("*** howTheShipWorks Function called ***"); 
    }

    private void credits() {
        this.console.println("*** credits Function called ***"); 
    }

    private void inventoryReport() {
        
        this.console.println("\n\nEnter the File Path for the report "
                + "to be saved to."); 
        String filePath = this.getInput();
        
        try {
            GameControl.inventoryReport(PathOfTheJedi.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("GettingHelpView", ex.getMessage());
        }
    }

    private void returnToPrevious() {
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }


    
}

  
