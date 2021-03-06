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
public class MainMenuView extends View {
    
    public MainMenuView() {
     super("\n"
            + "\n---------------------------------------------"
            + "\n| Main Menu                                 |"
            + "\n---------------------------------------------"
            + "\n1 - Load Game"
            + "\n2 - New Game"
            + "\n3 - How to Play the Game"
            + "\n4 - Options"
            + "\n5 - Quit"
            + "\n6 - Quit to Desktop"
            + "\n---------------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        
        String playerInput = (String) obj;
        
        char choice = playerInput.charAt(0);
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
                this.returnToPrevious();
                break;
            case '6':
                System.exit(0);
                break;
            default:
                 ErrorView.display("MainMenuView",
                         "*** Invalid selection *** Try Again");
                break;           
        }
      return false;  
    }
    

    private void loadGame() {
        
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

    private void newGame() {
        GameControl.createNewGame(PathOfTheJedi.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display(); 
    }

    private void howToPlayTheGame() {
        
        GettingHelpView helpMenuView = new GettingHelpView();
        helpMenuView.display();  
        
    }

    private void options() {
         this.console.println("*** options Function called ***");
    }

    private void returnToPrevious() {
        StartProgramView startMenu = new StartProgramView();
        startMenu.startProgram();
    }


    }
