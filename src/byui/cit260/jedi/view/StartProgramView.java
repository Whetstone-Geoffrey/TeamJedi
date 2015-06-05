/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import byui.cit260.jedi.control.ProgramControl;
import byui.cit260.jedi.model.Player;
import java.util.Scanner;

/**
 *
 * @author geoffreywhetstone
 */
public class StartProgramView {
    
    public void startProgram() {
        
        this.displayBanner();
      
        String playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
        
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
        System.out.println("\n\n****************************************************");
    
        System.out.println( "*                                                  *"
                        + "\n*  Welcome to the Path of the Jedi Text Based RPG  *"
                        + "\n*  In this Game you will play as a Young Jedi      *"
                        + "\n*  Knight named Cale who is seeking revenge        *"
                        + "\n*  on the Sith for what they did to his Parents.   *");
                
        System.out.println( "*                                                  *"
                        + "\n*  You will start by Training and learning the ways*"
                        + "\n*  of the force so Cale can seek out and find the  *"
                        + "\n*  Sith Lord that killed his family.  Exploring the*"
                        + "\n*  galaxy learning and finding help along the way, *"
                        + "\n*  Cale will find vengence or peace for the past.  *"
                        + "\n*                                                  *");
        
        System.out.println( "*                                                  *"
                        + "\n* Enjoy the Adventure and May the Force be with you*");
                
        System.out.println("****************************************************");
      
        
    }

    private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter the player's name below:");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if(playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
        
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n============================================");
        System.out.println("\tWelcome to Path of the Jedi " + player.getName());
        System.out.println("\tMay the Force Be With You!");
        System.out.println("============================================");
        
    }
    
}
