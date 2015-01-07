/*
 * HW01<br>
 * PR1_6: Prime Numbers
 * Exercise 3.9
 */
package pr1_6;


/**
 * Calculates the numbers between 1-100 that are prime.
 *
 * @author Brennan Metzelaar
 */
public class PR1_6 {

    /**
     * Displays the prime numbers between 1-100 on screen.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isPrime = true;

        System.out.println("The following numbers are prime:");
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
