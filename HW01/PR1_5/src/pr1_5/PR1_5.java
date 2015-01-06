/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_5;

import java.util.*;

/**
 * HW01<br>
 * PR1_5: Random Numbers
 *
 * @author Brennan Metzelaar
 */
public class PR1_5 {

    /**
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
