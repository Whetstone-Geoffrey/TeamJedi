/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.util.List;

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
            + "\n6 - Save Game"
            + "\n7 - Go back to last Save Point"
            + "\n8 - Quit to Main Menu"
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
                this.saveGame();
                break;
            case '7':
                this.goBackToLastSavePoint();
                break;
            case '8':
                this.display();
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        return true;
    }


    private void exploreCurrentPlace() {
        
       ExploreLocation explore = new ExploreLocation();
       explore.display();
    }

    private void findSomeoneToTalkTo() {
        System.out.println("*** findSomeoneToTalkTo Function called ***");

    }

    private void viewItemsInInventory() {
        System.out.println("*** viewItemsInInventory Function called ***");
    }

    private void viewCrewAndAllies() {
        ViewCrewList crewlist = new ViewCrewList();
        crewlist.display();
    }

    private void trainWithR4() {
        
        TrainWithR4View trainMenu = new TrainWithR4View();
        trainMenu.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame Function called ***");
    }

    private void goBackToLastSavePoint() {
        System.out.println("*** goBackToLastSavePoint Function called ***");
    }

  
    
}

