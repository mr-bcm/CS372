/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;
import java.util.Random;

/**
 * 
 * @author bmetzelaar16
 */
public class Dice {
    int sides = 0; // number of sides the dice has
    Random rnd = new Random();
    
    public Dice(int sides){
        this.sides = sides;
    }
    
    public int roll(){
        return (rnd.nextInt(sides) + 1);
    }
}
