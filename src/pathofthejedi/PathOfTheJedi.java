/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.jedi.model.Crystals;
import byui.cit260.jedi.model.Game;
import byui.cit260.jedi.model.Holograms;
import byui.cit260.jedi.model.Location;
import byui.cit260.jedi.model.Trainings;
import byui.cit260.jedi.model.Workshop;
import byui.cit260.jedi.model.Character;
import byui.cit260.jedi.model.InventoryList;
import byui.cit260.jedi.model.Player;
import byui.cit260.jedi.model.Ship;
import byui.cit260.jedi.view.StartProgramView;

/**
 *
 * @author geoffreywhetstone
 */
public class PathOfTheJedi {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PathOfTheJedi.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PathOfTheJedi.player = player;
    }
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        
        
        
        
        Game gamemain = new Game();
        
     gamemain.setExploreCurrentLocation("Current");
     gamemain.setReloadLastSave("Reload Last Saved Game");
     gamemain.setReturnToShip("Return to Ship");
     gamemain.setSaveGame("Save Game");
     gamemain.setViewCrew("View Crew");
     gamemain.setViewIventory("View Inventory");
     
     
     String gamemenu = gamemain.toString();
        System.out.println(gamemenu);
//------------------------------------------------------------------------------    
        
        Location location = new Location();
     
     location.setItemsAvailable("Any Items Available");
     
        System.out.println(location);
 //------------------------------------------------------------------------------      

        Trainings trainingsmenu = new Trainings();
        
    trainingsmenu.setLightSaberUse("Actions");
    trainingsmenu.setForceAffinity("");
    trainingsmenu.setForcePush("");
    trainingsmenu.setReturnToShip("");
    trainingsmenu.setUseHologram("");
    trainingsmenu.setCombat("");
                
        System.out.println(trainingsmenu);
//------------------------------------------------------------------------------        
        Holograms hologrammenu = new Holograms();
        
    hologrammenu.setDualLightsaber("Dual");
    hologrammenu.setForceChoke("Choke");
    hologrammenu.setForceLightning("Lightning");
    
        System.out.println(hologrammenu);
 //------------------------------------------------------------------------------       
        Workshop workshopmenu = new Workshop();
        
    workshopmenu.setLighsaberCrystal("Color");
    workshopmenu.setLightsabeHilt("Metal");
    workshopmenu.setReturnToShip("Return");
        
        System.out.println(workshopmenu);
//------------------------------------------------------------------------------        
        Crystals crystalmenu = new Crystals();
    
    crystalmenu.setBlue("Have");
    crystalmenu.setGreen("Don't Have");
    crystalmenu.setPurple("Have");
    crystalmenu.setRed("Have");
        
        System.out.println(crystalmenu);
//------------------------------------------------------------------------------        
        Character charactermenu = new Character();
        
    charactermenu.setForceLevel(1);
    
        System.out.println("Level 1");
//------------------------------------------------------------------------------        
        Ship shipmenu = new Ship();
            shipmenu.setAttribute("Set");
            shipmenu.setContinueMission("Continue Mission");
            shipmenu.setExitShip("Exiting Ship");
            shipmenu.setWorkshop("Construct");
            
            System.out.println(shipmenu);
//------------------------------------------------------------------------------
        InventoryList inventoryListMenu = new InventoryList();
            inventoryListMenu.setHologramTraining("Training");
            inventoryListMenu.setMandalorianMetal("Have");
            inventoryListMenu.setSynthCrystal("Have");
            
            System.out.println(inventoryListMenu);
//------------------------------------------------------------------------------
        Player playerMenu = new Player();
            playerMenu.setName("Name");
            
            System.out.println(playerMenu);
        
    }    
}
