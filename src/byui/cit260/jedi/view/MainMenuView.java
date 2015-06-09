/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.GameControl;
import java.util.Scanner;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------------"
            + "\n| Main Menu                                 |"
            + "\n---------------------------------------------"
            + "\n1 - Load Game"
            + "\n2 - New Game"
            + "\n3 - How to Play the Game"
            + "\n4 - Options"
            + "\n5 - Quit"
            + "\n6 - Quit to Desktop"
            + "\n---------------------------------------------";
            


    public void displayMenu() {
        
        char selection = ' ';
        do {
        
            System.out.println(MENU);
        
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != '5');
        
    
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
                this.loadGame();
                break;
            case '2':
                this.newGame();
                break;
            case '3':
                this.howToPlayTheGame();
                break;
            case '4':
                this.options();
                break;
            case '5':
                return;
            case '6':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
    
    }

    private void loadGame() {
        
        GameControl.loadGame(PathOfTheJedi.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void newGame() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu(); 
    }

    private void howToPlayTheGame() {
        
        GettingHelpView helpMenu = new GettingHelpView();
        helpMenu.displayHelpMenu();
        
        
        
    }

    private void options() {
        System.out.println("*** options Function called ***");
    }

    }
