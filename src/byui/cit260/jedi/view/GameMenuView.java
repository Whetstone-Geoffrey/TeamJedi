/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.GameControl;
import byui.cit260.jedi.control.InventoryControl;
import byui.cit260.jedi.control.LocationControl;
import byui.cit260.jedi.control.ShipControl;
import byui.cit260.jedi.exceptions.LocationControlException;
import byui.cit260.jedi.model.InventoryList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            + "\n6 - Seek out Sith"
            + "\n7 - Go To Ship"
            + "\n8 - Save Game"
            + "\n9 - Go back to last Save Point"
            + "\n0 - Quit to Main Menu"
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
        {
            try {
                this.battleScene();
            } catch (LocationControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case '7':
                this.goToShip();
                break;
            case '8':
                this.saveGame();
                break;
            case '9':
                this.goBackToLastSavePoint();
                break;
            case '0':
                this.returnToPrevious();
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
        FindSomeoneToTalkTo talk = new FindSomeoneToTalkTo();
        talk.display();
    }

    private void viewItemsInInventory() {
        InventoryControl inventorylist = new InventoryControl();
        inventorylist.InventoryList();
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
                this.console.println("\n\nEnter the File Path for the game "
                + "that is to be loaded."); 
        String filePath = this.getInput();
        
        try {
            GameControl.loadGame(PathOfTheJedi.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void returnToPrevious() {
        MainMenuView mainView = new MainMenuView();
        mainView.display();
    }

    private void battleScene() throws LocationControlException {
        LocationControl locationControl = new LocationControl();
        locationControl.combatEnemy();
    }

    

  
    
}

