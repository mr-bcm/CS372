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
     * <p>
     * We start by comparing years, if the year is the same we compare months, 
     * if the months are the same then we compare days.
     *
     * @param x first Event object for comparison
     * @param y second Event object for comparison
     * @return a negative, zero, or positive integer that represents whether the
     * first argument is less, equal, or greater than the second
     */
    @Override
    public int compare(Event x, Event y) {
        if (x.year < y.year){
            return -1;  // x is < y
        } else if (x.year > y.year){
            return 1;   // x is > y
        } else if (x.year == y.year){
            if (x.month < y.month){
                return -1;  // x is < y
            } else if (x.month > y.month){
                return 1;   // x is > y
            } else if (x.month == y.month){
                if (x.day < y.day){
                    return -1;  // x is < y
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
    
//    // ORIGINAL
//    /**
//     * The compare method from the Comparator class is overridden so that it
//     * takes two Event objects and compares them based off of their names.
//     *
//     * @param x first Event object for comparison
//     * @param y second Event object for comparison
//     * @return a negative, zero, or positive integer that represents whether the
//     * first argument is less, equal, or greater than the second
//     */
//    @Override
//    public int compare(Event x, Event y) {
//        return x.name.compareToIgnoreCase(y.name);
//    }
}
