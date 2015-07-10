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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author geoffreywhetstone
 */
public class PathOfTheJedi {
    
    protected static final BufferedReader keyboard = PathOfTheJedi.getInFile();
    protected static final PrintWriter console = PathOfTheJedi.getOutFile();

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
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static void main(String[] args) {
        
        try{
            
        PathOfTheJedi.inFile = new BufferedReader(new InputStreamReader(System.in));
            
        PathOfTheJedi.outFile = new PrintWriter(System.out, true);
        String filePath = "d:\\Users\\Moses\\Desktop\\CIT260 Java\\tmp\\log.txt";
        PathOfTheJedi.logFile = new PrintWriter(filePath);
        StartProgramView startProgramView = new StartProgramView(); 
        
            startProgramView.startProgram();

        } catch(Throwable te) {
               console.println(te.getMessage());
            
            
        }
        finally {
            try {
            if (PathOfTheJedi.inFile != null)
                PathOfTheJedi.inFile.close();
                
            if (PathOfTheJedi.outFile != null)
                PathOfTheJedi.outFile.close();
            
            if (PathOfTheJedi.logFile != null)
                PathOfTheJedi.logFile.close();
            } catch (IOException e) {
                console.println("Error closing files");
                return;
            }
                
        }   
    
             
        
        
        Game gamemain = new Game();
        
     gamemain.setExploreCurrentLocation("Current");
     gamemain.setReloadLastSave("Reload Last Saved Game");
     gamemain.setReturnToShip("Return to Ship");
     gamemain.setSaveGame("Save Game");
     gamemain.setViewCrew("View Crew");
     gamemain.setViewIventory("View Inventory");
     
     
     String gamemenu = gamemain.toString();
        console.println(gamemenu);
//------------------------------------------------------------------------------    
        
        Location location = new Location();
     
     location.setItemsAvailable("Any Items Available");
     
        console.println(location);
 //------------------------------------------------------------------------------      

        Trainings trainingsmenu = new Trainings();
        
    trainingsmenu.setLightSaberUse("Actions");
    trainingsmenu.setForceAffinity("");
    trainingsmenu.setForcePush("");
    trainingsmenu.setReturnToShip("");
    trainingsmenu.setUseHologram("");
    trainingsmenu.setCombat("");
                
        console.println(trainingsmenu);
//------------------------------------------------------------------------------        
        Holograms hologrammenu = new Holograms();
        
    hologrammenu.setDualLightsaber("Dual");
    hologrammenu.setForceChoke("Choke");
    hologrammenu.setForceLightning("Lightning");
    
        console.println(hologrammenu);
 //------------------------------------------------------------------------------       
        Workshop workshopmenu = new Workshop();
        
    workshopmenu.setLighsaberCrystal("Color");
    workshopmenu.setLightsabeHilt("Metal");
    workshopmenu.setReturnToShip("Return");
        
        console.println(workshopmenu);
//------------------------------------------------------------------------------        
        Crystals crystalmenu = new Crystals();
    
    crystalmenu.setBlue("Have");
    crystalmenu.setGreen("Don't Have");
    crystalmenu.setPurple("Have");
    crystalmenu.setRed("Have");
        
        console.println(crystalmenu);
//------------------------------------------------------------------------------        
/*        Character charactermenu = new Character();
        
    charactermenu.setForceLevel(1);
    
        console.println("Level 1");
*/
//------------------------------------------------------------------------------        
        Ship shipmenu = new Ship();
            shipmenu.setAttribute("Set");
            shipmenu.setContinueMission("Continue Mission");
            shipmenu.setExitShip("Exiting Ship");
            shipmenu.setWorkshop("Construct");
            
            console.println(shipmenu);
//------------------------------------------------------------------------------
        InventoryList inventoryListMenu = new InventoryList();
            inventoryListMenu.setHologramTraining("Training");
            inventoryListMenu.setMandalorianMetal("Have");
            inventoryListMenu.setSynthCrystal("Have");
            
            console.println(inventoryListMenu);
//------------------------------------------------------------------------------
        Player playerMenu = new Player();
            playerMenu.setName("Name");
            
            console.println(playerMenu);
        
    } 

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PathOfTheJedi.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PathOfTheJedi.inFile = inFile;
    }
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PathOfTheJedi.logFile = logFile;
    }
}
