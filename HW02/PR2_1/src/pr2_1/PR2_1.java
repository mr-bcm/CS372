/*
 * HW02-PR2_1: Gerbil ArrayList (11.2)
 * By: Brennan Metzelaar
 * Edited: 1/7/2015
 * Due: 1/9/2015
 */
package pr2_1;

import pr2_1.Gerbil;
import java.util.*; // used for ArrayList

/**
 * Main class that executes the Gerbil program.
 *
 * @author Brennan
 * @since 1/6/2015
 */
public class PR2_1 {

    /**
     * A List is populated that consists of Gerbil objects.
     * <p>
     * Each gerbil is given a number and is then told to hop. The number of each
     * gerbil is output to the user.
     *
     * @param args There is no supported use of additional arguments.
     */
    public static void main(String[] args) {
        List manyGerbils = new ArrayList();

        System.out.println("Watch the gerbils hop!");

        manyGerbils.add(new Gerbil(1));
        manyGerbils.add(new Gerbil(2));
        manyGerbils.add(new Gerbil(3));
        manyGerbils.add(new Gerbil(4));
        manyGerbils.add(new Gerbil(5));

        for (int i = 0; i < manyGerbils.size(); i++) {
            Gerbil.hop(manyGerbils.get(i));
        }
    }

}
