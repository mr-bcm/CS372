/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

/**
 * Calculate the approximate value of PI.
 * @author Brennan
 */
public class CalculatePI {


    /**
     * Calculate the approximate value of PI using Gregory-Leibniz series.
     * The number of terms to calculate is based on the depth that is given
     * to this function.
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
}
