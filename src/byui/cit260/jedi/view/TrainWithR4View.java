/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.util.Scanner;

/**
 *
 * @author Moses
 */
public class TrainWithR4View {
    
        private final String MENU = "\n"
            + "\n---------------------------------------------"
            + "\n| Train with R4                                 |"
            + "\n---------------------------------------------"
            + "\n1 - Lightsaber Use"
            + "\n2 - Physical Combat"
            + "\n3 - Force Push"
            + "\n4 - Defensive Actions"
            + "\n5 - Force Affinity"
            + "\n6 - Return to previous menu"
            + "\n---------------------------------------------";
        
    public void displayTrainMenu() {
        
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

    private void doAction(char choice) {
                        
            switch (choice) {
            case '1':
                this.lightSaberUse();
                break;
            case '2':
                this.physicalCombat();
                break;
            case '3':
                this.forcePush();
                break;
            case '4':
                this.defensiveActions();
                break;
            case '5':
                this.forceAffinity();
                break;
            case '6':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
    }

    private void lightSaberUse() {
        System.out.println("*** options Function called ***");
    }

    private void physicalCombat() {
        System.out.println("*** options Function called ***");
    }

    private void forcePush() {
        System.out.println("*** options Function called ***");
    }

    private void defensiveActions() {
        System.out.println("*** options Function called ***");
    }

    private void forceAffinity() {
        System.out.println("*** options Function called ***");
    }
    
}