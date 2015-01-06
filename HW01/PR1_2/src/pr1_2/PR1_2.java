/*
 * HW01-PR1_2: Iterating the Arguments
 * By: Brennan Metzelaar
 * Edited: 1/6/2015
 * Due: 1/6/2015
 */
package pr1_2;

/**
 *
 * @author Brennan
 */
public class PR1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There were no command line arguments.");
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
}
