/*
 * HW01<br>
 * PR1_5: Random Numbers
 */
package pr1_5;

import java.util.*;

/**
 * Outputs 25 random integer pairs with an explanation of weather the two 
 * values are the same size or if one is larger than another.
 *
 * @author Brennan Metzelaar
 */
public class PR1_5 {

    /**
     * A for loop runs 25 times output the value and comparison of the two
     * randomly generated values each time.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Random rand = new Random();

        for (int i = 0; i < 25; i++) {
            a = rand.nextInt(100) + 1;
            b = rand.nextInt(100) + 1;

            System.out.printf("%d) ", i + 1);

            if (a > b) {
                System.out.printf("a(%d) is greater than b(%d).\n", a, b);
            } else if (a < b) {
                System.out.printf("a(%d) is less than b(%d).\n", a, b);
            } else if (a == b) {
                System.out.printf("a(%d) and b(%d) are equal!\n", a, b);
            } else {
                System.out.printf("Something went wrong!!!");
            }
        }
    }

}
