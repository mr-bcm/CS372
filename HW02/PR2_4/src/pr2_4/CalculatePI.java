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

    double curr = 0;
    double numer = 4;   // Numerator
    double denom = 1;   // Denominator

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
        }
        return curr;
    }

    /**
     * Takes in the desired depth that PI will be calculated from and create a
     * table displaying the approximation of PI for each iteration.
     *
     * @param depth the number of terms to calculate for
     */
    public void drawTable(int size) {

        int count = 0;

        System.out.println("---------------------------");
        System.out.printf("| %d Iterations of PI |\n", size);
        System.out.println("---------------------------");
        
        double current = 0;
        double d = 1;

        for (int i = 0; i < 50; i++) {

            current += (4 / d);
            d++;
            d++;

            current -= (4 / d);

            System.out.printf("%7d: %1.8f", i, cat);
            System.out.printf("  ");

            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
            //System.out.print(d);
        }
        System.out.printf("Numer: %f\n", numer);
        System.out.printf("Denom: %f\n", denom);
        System.out.printf("Curr: %f\n", curr);

    }
}
