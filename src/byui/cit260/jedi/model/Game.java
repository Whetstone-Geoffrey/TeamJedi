/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jedi.model;

import java.util.Objects;

/**
 *
 * @author geoffreywhetstone
 */
public class Game {
    //class instance variables
    private String exploreCurrentLocation;
    private String viewIventory;
    private String viewCrew;
    private String saveGame;
    private String reloadLastSave;
    private String exitGame;
    private String returnToShip;
    private Player player;
    private Location location;
    public Character character;
    private InventoryList inventory;
    private Ship ship;

    @Override
    public String toString() {
        return "Game{" + "exploreCurrentLocation=" + exploreCurrentLocation + ", viewIventory=" + viewIventory + ", viewCrew=" + viewCrew + ", saveGame=" + saveGame + ", reloadLastSave=" + reloadLastSave + ", exitGame=" + exitGame + ", returnToShip=" + returnToShip + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.exploreCurrentLocation);
        hash = 41 * hash + Objects.hashCode(this.viewIventory);
        hash = 41 * hash + Objects.hashCode(this.viewCrew);
        hash = 41 * hash + Objects.hashCode(this.saveGame);
        hash = 41 * hash + Objects.hashCode(this.reloadLastSave);
        hash = 41 * hash + Objects.hashCode(this.exitGame);
        hash = 41 * hash + Objects.hashCode(this.returnToShip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.exploreCurrentLocation, other.exploreCurrentLocation)) {
            return false;
        }
        if (!Objects.equals(this.viewIventory, other.viewIventory)) {
            return false;
        }
        if (!Objects.equals(this.viewCrew, other.viewCrew)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        if (!Objects.equals(this.reloadLastSave, other.reloadLastSave)) {
            return false;
        }
        if (!Objects.equals(this.exitGame, other.exitGame)) {
            return false;
        }
        if (!Objects.equals(this.returnToShip, other.returnToShip)) {
            return false;
        }
        return true;
    }
    
    

    public Game() {
    }
    
    

    public String getExploreCurrentLocation() {
        return exploreCurrentLocation;
    }

    public void setExploreCurrentLocation(String exploreCurrentLocation) {
        this.exploreCurrentLocation = exploreCurrentLocation;
    }

    public String getViewIventory() {
        return viewIventory;
    }

    public void setViewIventory(String viewIventory) {
        this.viewIventory = viewIventory;
    }

    public String getViewCrew() {
        return viewCrew;
    }

    public void setViewCrew(String viewCrew) {
        this.viewCrew = viewCrew;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }

    public String getReloadLastSave() {
        return reloadLastSave;
    }

    public void setReloadLastSave(String reloadLastSave) {
        this.reloadLastSave = reloadLastSave;
    }

    public String getExitGame() {
        return exitGame;
    }

    public void setExitGame(String exitGame) {
        this.exitGame = exitGame;
    }

    public String getReturnToShip() {
        return returnToShip;
    }

    public void setReturnToShip(String returnToShip) {
        this.returnToShip = returnToShip;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
        public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter() {
        this.character = character;
    }

    public InventoryList getInventoryList() {
        return inventory;
    }

    public void setInventoryList(InventoryList inventoryList) {
        this.inventory = inventoryList;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

}
