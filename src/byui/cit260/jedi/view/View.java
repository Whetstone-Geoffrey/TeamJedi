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
public abstract class View implements ViewInterface{
    
    private String promptMessage;

   public View(String promptMessage)  {
       this.promptMessage = promptMessage;
   }
    
    @Override
    public void display() {
        String playerInput = "";
        boolean done = false;
                
        do {
                System.out.println(this.promptMessage);
                playerInput = this.getInput();
                done = this.doAction(playerInput);
                } while (!done);
            }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String playerInput = null;
    
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
    
     public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
}
