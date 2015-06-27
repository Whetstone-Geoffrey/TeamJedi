/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.GameControl;
import java.util.List;
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
                this.display();
                break;
            case '6':
                System.exit(0);
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        return false;
    }

    private void loadGame() {
        
        GameControl.loadGame(PathOfTheJedi.getPlayer());
        
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
        System.out.println("*** options Function called ***");
    }


    }
