/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author geoffreywhetstone
 */
public class FindSomeoneToTalkTo extends View{
    
    public FindSomeoneToTalkTo()  {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Find Someone To Talk To                   |"
            + "\n---------------------------------------------"
            + "\n You are looking for someone to speak with "
            + "\n Press 1 to continue"
            + "\n Press 2 to return to the the Game Menu"
            + "\n---------------------------------------------");
     
}
    
    @Override
    public boolean doAction(Object obj){
        
        String playerInput = (String) obj;          
        char choice = playerInput.charAt(0);
        
        switch (choice) {
            case '1':
                this.explore();
                break;
            case '2':
                this.returnToPrevious();
                break;
            default:
                ErrorView.display("FindSomoneToTalkTo",
                         "*** Invalid selection *** Try Again");
                break;
                    
        }
        return false;
    }
    
public final Random random = new Random();

    private void explore() {
    
         
 
		List<String> list = new ArrayList<>();
		list.add("Citizen: You dont look like you're from here, What could I help you with?");
		list.add("Sith: You Jedi Scum! Leave This planet OR else!");
		list.add("Moisture Farmer: We don't see your kind around here too often Master Jedi.");
		list.add("Trader: What can I do ya for?");
		list.add("Cantina Barman: I've got drinks or information, anything else don't bother asking.");
 
		ExploreLocation obj = new ExploreLocation();
		for(int i = 0; i < 1; i++){
			this.console.println(obj.getRandomList(list));
		}
 
	}
 
	public String getRandomList(List<String> list) {
 
	    //0-4
	    int index = random.nextInt(list.size());
	    this.console.println("\nYou found a :" + index );
	    return list.get(index);
 
	}

    private void returnToPrevious() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
