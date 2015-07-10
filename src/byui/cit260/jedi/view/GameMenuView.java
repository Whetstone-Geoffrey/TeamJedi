/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.GameControl;
import byui.cit260.jedi.model.InventoryList;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Game Menu                                 |"
            + "\n---------------------------------------------"
            + "\n1 - Explore current place"
            + "\n2 - Find someone to talk to"
            + "\n3 - View Items in the Inventory"
            + "\n4 - View Crew or Allies"
            + "\n5 - Train with R4"
            + "\n6 - Go To Ship"
            + "\n7 - Save Game"
            + "\n8 - Go back to last Save Point"
            + "\n9 - Quit to Main Menu"
            + "\n---------------------------------------------");
     
}
    
    
    @Override
    public boolean doAction(Object obj){
        
        String playerInput = (String) obj;          
        char choice = playerInput.charAt(0);
        
        switch (choice) {
            case '1':
                this.exploreCurrentPlace();
                break;
            case '2':
                this.findSomeoneToTalkTo();
                break;
            case '3':
                this.viewItemsInInventory();
                break;
            case '4':
                this.viewCrewAndAllies();
                break;
            case '5':
                this.trainWithR4();
                break;
            case '6':
                this.goToShip();
                break;
            case '7':
                this.saveGame();
                break;
            case '8':
                this.goBackToLastSavePoint();
                break;
            case '9':
                this.display();
                break;
            default:
                ErrorView.display("GameMenuVeiw",
                         "*** Invalid selection *** Try Again");
                break;
                    
        }
        return false;
    }


    private void exploreCurrentPlace() {
        
       ExploreLocation explore = new ExploreLocation();
       explore.display();
    }

    private void findSomeoneToTalkTo() {
        this.console.println("*** findSomeoneToTalkTo Function called ***");

    }

    private void viewItemsInInventory() {
        InventoryList inventorylist = new InventoryList();
    }

    private void viewCrewAndAllies() {
        ViewCrewList crewlist = new ViewCrewList();
        crewlist.display();
    }

    private void trainWithR4() {
        
        TrainWithR4View trainMenu = new TrainWithR4View();
        trainMenu.display();
    }
    
    private void goToShip() {
        ShipView ship = new ShipView();
        ship.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the File Path for the game "
                + "is to be saved."); 
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(PathOfTheJedi.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    
    

    private void goBackToLastSavePoint() {
        this.console.println("*** goBackToLastSavePoint Function called ***");
    }

    

  
    
}

