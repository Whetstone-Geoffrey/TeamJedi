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
public class ExploreLocation extends View{

       
    public ExploreLocation()  {
        super("\n"
            + "\n---------------------------------------------"
            + "\n| Explore Location                          |"
            + "\n---------------------------------------------"
            + "\n You are Exploring the Location "
            + "\n Press 1 to continue"
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
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
                    
        }
        return false;
    }

    
    public final Random random = new Random();

    private void explore() {
    
         
 
		List<String> list = new ArrayList<>();
		list.add("Mandalorian Metal");
		list.add("Synth Crystal: Red");
		list.add("Synth Crystal: Blue");
		list.add("Synth Crystal: Green");
		list.add("Hologram Training: Force Push");
 
		ExploreLocation obj = new ExploreLocation();
		for(int i = 0; i < 1; i++){
			System.out.println(obj.getRandomList(list));
		}
 
	}
 
	public String getRandomList(List<String> list) {
 
	    //0-4
	    int index = random.nextInt(list.size());
	    System.out.println("\nYou Found :" + index );
	    return list.get(index);
 
	}
    }
    
    


  
  
 

