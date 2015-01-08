/*
 * HW02-PR2_3: Gerbil Map (11.4)
 * By: Brennan Metzelaar
 * Edited: 1/8/2015
 * Due: 1/9/2015
 */
package pr2_3;

import java.util.*;

/**
 * Main class that executes the Gerbil program.
 * <p>
 * A gerbil is assigned a number at creation and has various methods, such as
 * hopping.
 *
 * @author Brennan
 * @since 1/7/2015
 */
public class PR2_3 {

    /**
     * A Map is populated that consists of gerbil names(strings) and gerbil
     * objects.
     *
     * @param args Program does not specifically make use of additional 
     * arguments at this time
     */
    public static void main(String[] args) {
        String[] names = new String[]{"Tom", "Sam", "Sue", "Jacob", "Will"};

        Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
        for (int i = 1; i < 6; i++) {
            gerbilMap.put(names[i - 1], new Gerbil(i));
        }

        System.out.println("The gerbils are beginning to hop!");
        
        Iterator<String> it = gerbilMap.keySet().iterator();
        while (it.hasNext()) {
            String gName = it.next();
            System.out.print(gName);
            gerbilMap.get(gName).hop();
        }
    }

}
