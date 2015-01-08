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
//    int dot;  // depth of terms
//    double currentPI = 4;   // current value of PI
//    double numerator = 4;   // numerator
//    double denominator = 1;  // denominator
//    boolean currentSign = false;

    /**
     * Calculate the approximate value of PI using Gregory-Leibniz series. The
     * number of terms to calculate is based on the depth that is given to this
     * function.
     *
     * @param depth the number of terms to calculate for
     * @return
     */
    public double Calculate(int depth) {
        double numer = 4;  // numerator
        double denom = 1;  // denominator
        double curr = 4;
        boolean sign = false;   // determins if addition or subtraction

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
     * Output a table for the first 200,00 terms of PI.
     */
    public void drawTable() {
        double curr = 4;
        double numer = 4;
        double denom = 1;
        boolean sign = false;

        double[] vals = {curr, numer, denom};

        for (int i = 0; i < 200000; i++) {
            vals = advCalculate(sign, vals);
            if (sign == false) {
                sign = true;
            } else if (sign == true) {
                sign = false;
            }
            curr = vals[0];

            System.out.printf("%d: %f", i+1, curr);
            System.out.println();
        }
    }

    public double[] advCalculate(boolean sign, double[] vals) {
        vals[2] += 2; // increment the denominator by two each itteration
        if (sign == false) {
            vals[0] -= (vals[1] / vals[2]);
        } else if (sign == true) {
            vals[0] += (vals[1] / vals[2]);
        }
        return vals;
    }

}
