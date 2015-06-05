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
public class GettingHelpView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------------"
            + "\n| Getting Help                              |"
            + "\n---------------------------------------------"
            + "\n1 - Movement"
            + "\n2 - Goal of the Game"
            + "\n3 - Battle Events"
            + "\n4 - How the Ship Works"
            + "\n5 - Credits"
            + "\n6 - Previous Menu"
            + "\n---------------------------------------------";
            
    public void displayHelpMenu() {
        
        char selection = ' ';
        do {
        
            System.out.println(MENU);
        
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != '6');
        
    
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
            System.out.println("Invalid Input, Enter a number from 1 - 6");  
        }
        break;
        
    }
        return playerInput;
    }

    public void doAction(char choice) {
        
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
            case '6':
                //How to call the function from MainMenuView to return the the other menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        
    }

    private void movement() {
        System.out.println("*** movement Function called ***"); 
    }
    
    private void goalOfTheGame() {
        System.out.println("*** goalOfTheGame Function called ***"); 
    }

    private void battleEvents() {
        System.out.println("*** battleEvents Function called ***"); 
    }

    private void howTheShipWorks() {
        System.out.println("*** howTheShipWorks Function called ***"); 
    }

    private void credits() {
        System.out.println("*** credits Function called ***"); 
    }
    
}

  
