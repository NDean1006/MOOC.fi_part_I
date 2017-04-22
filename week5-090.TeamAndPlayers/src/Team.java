import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Team {
    private String name;
     private int maxSize = 16;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    
    public Team (String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player Player){
        if (playerList.size() < this.maxSize){
            playerList.add(Player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return playerList.size();
    }
    
    public void printPlayers(){
        for (Player Player: playerList){
            System.out.println(Player);
        }
    }
    public int goals() {
        int goals = 0;
        for (Player players : playerList) {
            goals += players.goals();
        }
        return goals;
    }
    
     
}
