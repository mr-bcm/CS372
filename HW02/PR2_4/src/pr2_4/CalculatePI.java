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
     * Takes in the desired depth that PI will be calculated from and create a
     * table displaying the approximation of PI for each iteration.
     *
     * @param depth the number of terms to calculate for
     */
    public List calculate(int size) {

        int count = 0;
        double curr = 0;
        double numer = 4;   // Numerator
        double denom = 1;   // Denominator
        List list = new ArrayList();

        for (int i = 0; i < size; i++) {

            curr += ((double) numer / (double) denom);
            denom += (double) 2;

            list.add(curr);

            curr -= ((double) numer / (double) denom);
            denom += (double) 2;

            list.add(curr);

//            count++;
//            if (count == 5) {
//                System.out.println();
//                count = 0;
//            }
            //System.out.print(d);
        }
        return list;
//        System.out.printf("Numer: %f\n", numer);
//        System.out.printf("Denom: %f\n", denom);
//        System.out.printf("Curr: %f\n", curr);

    }

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
