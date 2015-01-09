/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

import java.util.List;
import java.util.ArrayList;

/**
 * Calculate the approximate value of PI.
 *
 * @author Brennan
 */
public class CalculatePI {

    /**
     * Takes in the desired depth that PI will be calculated from and returns a
     * list of doubles with every value of PI up to the desired depth.
     *
     * @param size the number of terms to calculate for
     * @return A List of double values for each iteration until the specified max (size) is reached
     */
    public List calculate(int size) {
        double curr = 0;
        double numer = 4;   // Numerator
        double denom = 1;   // Denominator
        boolean sign = true;
        List list = new ArrayList();

        for (int i = 0; i < size; i++) {
            if (sign == true) {
                curr += (numer / denom);
                list.add(curr);
                sign = false;
            } else if (sign == false) {
                curr -= (numer / denom);
                list.add(curr);
                sign = true;
            }
            denom += (double) 2;
        }
        return list;
    }

    /**
     * Calls the calculate function and outputs the results in a formatted
     * table.
     *
     * @param size the number of computations (depth) that is to be calculated
     * for PI
     */
    public void drawTable(int size) {
        List piValues;
        piValues = calculate(size);

        System.out.println("--------------------------------");
        System.out.printf("  %7d Iterations of PI \n", size);
        System.out.println("--------------------------------");

        int count = 0;
        for (int i = 0; i < piValues.size(); i++) {
            System.out.printf("%7d: %1.8f", i + 1, piValues.get(i));
            System.out.printf("    ");

            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }

}
