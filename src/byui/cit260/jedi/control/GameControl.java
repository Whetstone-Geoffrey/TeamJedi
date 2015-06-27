/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.control;

import byui.cit260.jedi.model.Game;
import byui.cit260.jedi.model.InventoryList;
import byui.cit260.jedi.model.Location;
import byui.cit260.jedi.model.Player;
import byui.cit260.jedi.model.Ship;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author geoffreywhetstone
 */
public class GameControl {

    public static void createNewGame(Player player){
        Game game = new Game();
        PathOfTheJedi.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Location location = new Location();
        game.setLocation(location);
        
        game.setCharacter();
        
        InventoryList inventoryList = new InventoryList();
        game.setInventoryList(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        

    }
    public static void loadGame(Player player) {
        System.out.println("\n loadGame stub function called ***");
    }

    private static class Constants {
        private static int NUMBER_OF_INVENTORY_ITEMS;

        public Constants() {
        }
    }
    public enum Item {
        mandalorianMetal,
        synthCrystal,
        hologramTraining;
    }
    
    public static InventoryList[] createInventoryList() {
        
        InventoryList[] inventory = new InventoryList[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryList mandalorianMetal = new InventoryList();
        mandalorianMetal.setDescription("Mandalorian Metal");
        mandalorianMetal.setQunatityInStock(0);
        mandalorianMetal.setRequiredAmount(0);
        inventory[Item.mandalorianMetal.ordinal()] = mandalorianMetal;
        
        InventoryList synthCrystal = new InventoryList();
        synthCrystal.setDescription("Synth Crystal");
        synthCrystal.setQunatityInStock(0);
        synthCrystal.setRequiredAmount(0);
        inventory[Item.synthCrystal.ordinal()] = synthCrystal;
        
        InventoryList hologramTraining = new InventoryList();
        hologramTraining.setDescription("Hologram Training");
        hologramTraining.setQunatityInStock(0);
        hologramTraining.setRequiredAmount(0);
        inventory[Item.hologramTraining.ordinal()] = hologramTraining;
        
        return inventory;
    }
    
}
