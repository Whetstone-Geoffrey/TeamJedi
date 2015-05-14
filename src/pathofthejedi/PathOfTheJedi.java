/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.jedi.model.Game;
import byui.cit260.jedi.model.Location;

/**
 *
 * @author geoffreywhetstone
 */
public class PathOfTheJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gamemain = new Game();
        
     gamemain.setExploreCurrentLocation("Current");
     gamemain.setReloadLastSave("Reload Last Saved Game");
     gamemain.setReturnToShip("Return to Ship");
     gamemain.setSaveGame("Save Game");
     gamemain.setViewCrew("View Crew");
     gamemain.setViewIventory("View Inventory");
     
     
     String gamemenu = gamemain.toString();
        System.out.println(gamemenu);
    

   
        Location location = new Location();
    }   
        
    
        
}
