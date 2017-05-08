import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class NightSky {
    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;
        
        
    public NightSky(double density){
        this.density = density;
        this.height = 10;
        this.width = 20;
    }
    
    public NightSky(int width, int height){
        this.height = height;
        this.width = width;
        this.density = 0.1;
    }
    
    public NightSky(double density,int width, int height){
        this.density = density;
        this.height = height;
        this.width = width;
    }
    
    public void printLine() {
        Random rand = new Random();
        String toPrint = "";
        for (int i = 0; i < this.width; i++) {
            if (rand.nextDouble() <= this.density) {
                toPrint += "*";
                starsInLastPrint++;
            } else {
                toPrint += " ";
            }
        }
        System.out.print(toPrint);
    }
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
        System.out.println("");
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
