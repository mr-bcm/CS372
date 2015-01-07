/*
 * HW02-PR2_3: Gerbil Map (11.4)
 * By: Brennan Metzelaar
 * Edited: 1/7/2015
 * Due: 1/9/2015
 */
package pr2_3;

import java.util.*;

/**
 * Main class that executes the Gerbil program.
 * @author Brennan
 * @since 1/7/2015
 */
public class PR2_3 {

    /**
     * A List is populated that consists of Gerbil objects.
     * <p>
     * The function takes in the user input of how many gerbils they want.
     * Then each gerbil is given a number and is then told to hop.
     * The number of each gerbil is output to the user.
     *
     * @param args There is no supported use of additional arguments.
     */
    public static void main(String[] args) {
        int size = 0;   // the total number of gerbils to itterate through
        List manyGerbils = new ArrayList();

        System.out.println("How many Gerbils are there?");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        System.out.println("All of the gerbils have started hopping!?");

        for (int i = 0; i < size; i++) {
            manyGerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < manyGerbils.size(); i++) {
            Gerbil.hop(manyGerbils.get(i));
        }
    }

}
