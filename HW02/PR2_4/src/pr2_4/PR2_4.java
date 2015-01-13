/*
 * HW02-PR2_4: Calculating PI
 * By: Brennan Metzelaar
 * Edited: 1/8/2015
 * Due: 1/9/2015
 */
package pr2_4;

import java.util.List;
import java.util.ArrayList;

/**
 * Main class that calls the CalculatePI.
 * @author Brennan
 */
public class PR2_4 {

    /**
     * Main calls PI functions to calculate the approximation of PI from 1 through
     * 200,000 iterations of the Gregory-Leibniz series.
     * 
     * @param args command line argument that is used to specify the depth to which
     * PI is to be approximated to
     */
    public static void main(String[] args) {
        int depth; 
        List piValues;
        CalculatePI PI = new CalculatePI();

        if (args.length == 0) {
            // leave if statement
            //PT -- why? It's not doing anything here
        } else if (args.length > 0) {
            depth = Integer.parseInt(args[0]);
            
            System.out.printf("Calculating PI from a depth of %d\n", depth);
            System.out.printf("PI: ");
            piValues = PI.getAll(depth);
            
            int lastElement = piValues.size();
            System.out.printf("%1.8f", piValues.get(lastElement - 1));
        }

        System.out.println();

        PI.drawTable(200000);   // calculate X values of PI and output a formatted table
    }

}
