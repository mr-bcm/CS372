/*
 * HW03-PR3_1: User Input
 * By: Brennan Metzelaar
 * Edited: 1/12/2015
 * Due: 1/13/2015
 */
package pr3_1;

import java.util.*; // Scanner, List, ListArray

/**
 * Main class - Get user input of 10 integers and calculate the max, min, and
 * average.
 *
 * @author Brennan
 */
public class PR3_1 {

    /**
     * Get user input of 10 integers and output the max, min, and average values
     * of the 10 integers.
     *
     * @param args not supported
     */
    public static void main(String[] args) {
        List l = new ArrayList();
        Range vr = new Range();

        System.out.println("Enter 10 numbers:");
        Scanner input = new Scanner(System.in);
        
        try {
            for (int i = 0; i < 10; i++) {
                l.add(input.nextInt());
            }
        } catch (InputMismatchException e) {
            // System.out.println(e.getMessage());
            System.out.println("ERROR: You can only enter integers");
        }
        
            System.out.println();
            System.out.println("From the numbers that were entered");
            System.out.printf("The largest number is %d\n", (int) vr.getMaxInt(l));
            System.out.printf("The smallest number is %d\n", (int) vr.getMinInt(l));
            System.out.printf("The average of the numbers is %d\n", (int) vr.getAverageInt(l));
    }
}
