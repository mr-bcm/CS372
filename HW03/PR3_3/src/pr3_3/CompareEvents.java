/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import java.util.*;

/**
 * Class is used for comparing Event objects to one another.
 *
 * @author Brennan
 */
public class CompareEvents implements Comparator<Event> {

    /**
     * The compare method from the Comparator class is overridden so that it
     * takes two Event objects and compares them based off of their names.
     *
     * @param x first Event object for comparison
     * @param y second Event object for comparison
     * @return a negative, zero, or positive integer that represents whether the
     * first argument is less, equal, or greater than the second
     */
    @Override
    public int compare(Event x, Event y) {
        return x.name.compareToIgnoreCase(y.name);
    }
}
