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
        // int depth = Integer.parseInt(args[0]);
        int depth = 100;
        List piValues;
        CalculatePI PI = new CalculatePI();

        // System.out.printf("Calculating PI from a depth of %d\n", depth);
        // System.out.printf("PI: ");
        // System.out.println(PI.Calculate(depth));
        // System.out.println();
        System.out.println("--------------------------------");
        System.out.printf("  %7d Iterations of PI \n", depth);
        System.out.println("--------------------------------");

        piValues = PI.drawTable(depth);

        int count = 0;
        for (int i = 0; i < piValues.size(); i++) {
            System.out.printf("%7d: %1.8f", i+1, piValues.get(i));
            System.out.printf("    ");

            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }

    }

}
