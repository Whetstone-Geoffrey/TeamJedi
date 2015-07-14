/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected final PrintWriter console = PathOfTheJedi.getOutFile();

   public View(String promptMessage)  {
       this.promptMessage = promptMessage;
   }
    
    @Override
    public void display() {
        String playerInput = "";
        boolean done = false;
                
        do {
                this.console.println(this.promptMessage);
                playerInput = this.getInput();
                done = this.doAction(playerInput);
                } while (!done);
            }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String playerInput = null;
    
        while(!valid) {
        
            this.console.println("Enter the Key of the Menu Desired You Will");
        
            try {
                playerInput = this.keyboard.readLine();
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + e.getMessage());
                return null;
            }
            playerInput = playerInput.trim();
        
            if(playerInput.length() < 1) {
            ErrorView.display("View",
                    "Invalid Input, Enter a number from 1 - 9");  
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
