/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

/**
 * Calculate the approximate value of PI.
 *
 * @author Brennan
 */
public class CalculatePI {

    double curr = 4;
    double numer = 4;   // Numerator
    double denom = 1;   // Denominator
    boolean sign = false;   // determines if the next itteration is additon or subtraction

    /**
     * Calculate the approximate value of PI using Gregory-Leibniz series. The
     * number of terms to calculate is based on the depth that is given to this
     * function.
     *
     * @param depth the number of terms to calculate for
     * @return
     */
    public double Calculate(int depth) {

        for (int i = 0; i < depth; i++) {
            denom += 2; // increment the denominator by two each itteration
            if (sign == false) {
                curr -= (numer / denom);
                sign = true;
            } else if (sign == true) {
                curr += (numer / denom);
                sign = false;
            }
        }
        return curr;
    }

    /**
     * Takes in the desired depth that PI will be calculated from and create a
     * table displaying the approximation of PI for each iteration.
     *
     * @param depth the number of terms to calculate for
     */
    public void drawTable(int depth) {

        int count = 0;

        System.out.println("---------------------------");
        System.out.printf("| %d Iterations of PI |\n", depth);
        System.out.println("---------------------------");

        for (int i = 0; i < depth; i++) {

            curr += (numer / denom) - (numer / (denom + 2));
            denom += 4;

//            denom += 2; // increment the denominator by two each itteration
//            if (sign == false) {
//                curr -= (numer / denom);
//                sign = true;
//            } else if (sign == true) {
//                curr += (numer / denom);
//                sign = false;
//            }
            System.out.printf("%7d: %1.8f", i + 1, curr);
            System.out.printf("  ");

            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }

    /**
     * Calculates a single instance of pie.
     * <p>
     * To do so the function must be given a 2 element array that contains the
     * current value of PI and the denominator. It must also take in a boolean
     * sign that indicates whether or not the equation should add or subtract
     * from the current value of PI.
     *
     * @param sign determines if the calculation needs to subtract/add to PI's
     * current value
     * @param vals Two value array [value of PI, last denominator
     * @return
     */
    public double[] advCalculate(boolean sign, double[] vals) {
        vals[1] += 2; // increment the denominator by two each itteration
        if (sign == false) {
            vals[0] -= (numer / vals[1]);
        } else if (sign == true) {
            vals[0] += (numer / vals[1]);
        }
        return vals;
    }

}
