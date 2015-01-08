/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;

/**
 * A gerbil is assigned a number and has various functions, such as being able to hop.
 * @author Brennan
 * @since 1/7/2015
 */
public class Gerbil {
    private int gerbilNumber;
    
    /**
     * Initialize the number that represents this Gerbil.
     * @param x the number of gerbils
     */
    public Gerbil(int x){ gerbilNumber = x; }
    
    /**
     * Outputs the gerbil's number and that the gerbil is hopping.
     */
    public void hop(){
        System.out.println("(#" + gerbilNumber + ")" + " is hopping!");
    }
    
    /**
     * The number of the current gerbil is returned
     * @return an integer that represents the gerbil's number
     */
    public int getNum(){ return gerbilNumber; }
}
