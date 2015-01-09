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
 *
 * @author Brennan
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int depth = Integer.parseInt(args[0]);

        List piValues;
        CalculatePI PI = new CalculatePI();

         System.out.printf("Calculating PI from a depth of %d\n", depth);
         System.out.printf("PI: ");
         System.out.println(PI.calculate(depth));
         System.out.println();
         
         PI.drawTable(6);
        

    }

}
