/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.util.Scanner;

/**
 *
 * @author geoffreywhetstone
 */
public class GameMenuView {

       private final String MENU = "\n"
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
            + "\n---------------------------------------------";
     

    
    public void displayMenu() {
        char selection = ' ';
                do {
        
                    System.out.println(MENU);
        
                    String input = this.getInput();
                    selection = input.charAt(0);
            
                    this.doAction(selection);
            
                } while (selection != '8');
            }

    private String getInput() {
        boolean valid = false;
        String playerInput = null;
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid) {
        
            System.out.println("Enter the Key of the Menu Desired You Will");
        
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
        
            if(playerInput.length() < 1) {
            System.out.println("Invalid Input, Enter a number from 1 - 8");  
            }
            break;
        
        }
            return playerInput;
        }

    private void doAction(char choice) {
        
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
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        
    }

    private void exploreCurrentPlace() {
        System.out.println("*** options Function called ***");

    }

    private void findSomeoneToTalkTo() {
        System.out.println("*** options Function called ***");

    }

    private void viewItemsInInventory() {
        System.out.println("*** options Function called ***");
    }

    private void viewCrewAndAllies() {
        System.out.println("*** options Function called ***");
    }

    private void trainWithR4() {
    }

    private void saveGame() {
        System.out.println("*** options Function called ***");
    }

    private void goBackToLastSavePoint() {
        System.out.println("*** options Function called ***");
    }
  
    
    
}
