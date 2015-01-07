/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_1;

/**
 * A gerbil is assigned a number and has various functions, such as being able to hop.
 * @author Brennan
 * @since 1/7/2015
 */
public class Gerbil {
    private int gerbilNumber;
    
//    /**
//     * Default constructor initializes the number of gerbils to 5.
//     */
//    public Gerbil(){ gerbilNumber = 5; }
    
    /**
     * Initialize the number that represents this Gerbil.
     * @param x the number of gerbils
     */
    public Gerbil(int x){ gerbilNumber = x; }
    
    /**
     * Outputs that g gerbil is jumping
     * @param g the number of the gerbil in question
     */
    public static void hop(Object g){
        Gerbil gerbil = (Gerbil)g;
        System.out.println("Gerbil #" + gerbil.getNum() + " is hopping!");
    }
    
    /**
     * The number of the current gerbil is returned
     * @return an integer that represents the gerbil's number
     */
    public int getNum(){ return gerbilNumber; }
}
