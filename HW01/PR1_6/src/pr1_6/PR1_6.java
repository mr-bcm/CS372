/*
 * HW01<br>
 * PR1_6: Prime Numbers
 * Exercise 3.9
 */
package pr1_6;

import java.util.Scanner;

/**
 * HW01<br>
 * PR1_6: Prime Numbers
 *
 * @author Brennan Metzelaar
 */
public class PR1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isPrime = true;
        int num;
        //Scanner input = new Scanner(System.in);
        //num = input.nextDouble();

        for (int i = 1; i < 101; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.printf("%d is a prime number!\n", i);
            }
        }
    }

}
