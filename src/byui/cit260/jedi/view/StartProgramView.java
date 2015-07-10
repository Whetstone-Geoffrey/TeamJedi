/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.ProgramControl;
import byui.cit260.jedi.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;


/**
 *
 * @author geoffreywhetstone
 */
public class StartProgramView  {
    
    protected final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected final PrintWriter console = PathOfTheJedi.getOutFile();
    
    public void startProgram() {
        
        this.displayBanner();
      
        String playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        
        /*startProgram(): void
        BEGIN
        Display the banner screen
        Get the players name
        Create a new player
        DISPLAY a customized welcome message
        DISPLAY the main menu
        END*/ 
        
        
    }

    private void displayBanner() {
         this.console.println("\n\n****************************************************");
    
         this.console.println( "*                                                  *"
                        + "\n*  Welcome to the Path of the Jedi Text Based RPG  *"
                        + "\n*  In this Game you will play as a Young Jedi      *"
                        + "\n*  Knight named Cale who is seeking revenge        *"
                        + "\n*  on the Sith for what they did to his Parents.   *");
                
         this.console.println( "*                                                  *"
                        + "\n*  You will start by Training and learning the ways*"
                        + "\n*  of the force so Cale can seek out and find the  *"
                        + "\n*  Sith Lord that killed his family.  Exploring the*"
                        + "\n*  galaxy learning and finding help along the way, *"
                        + "\n*  Cale will find vengence or peace for the past.  *"
                        + "\n*                                                  *");
        
         this.console.println( "*                                                  *"
                        + "\n* Enjoy the Adventure and May the Force be with you*");
                
         this.console.println("****************************************************");
      
        
    }

    private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        try {
                
        while(!valid) {
            
             this.console.println("Enter the player's name below:");
            
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            
            if(playersName.length() < 2) {
                 ErrorView.display("StartProgramView",
                         "*** Invalid Name *** Try Again");
                continue;
            }
            break;
        }
    } catch (Exception e) {
             ErrorView.display("StartProgramView",
                     "Error reading input:" + e.getMessage());
    }
        
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
         this.console.println("\n\n============================================");
         this.console.println("\tWelcome to Path of the Jedi " + player.getName());
         this.console.println("\tMay the Force Be With You!");
         this.console.println("============================================");
        
    }
    
}
