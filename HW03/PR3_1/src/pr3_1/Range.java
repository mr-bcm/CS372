/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.*;

/**
 * Contains methods for calculating the minimum, maximum, and average values
 * within a List.
 * <p>
 * There are two sets of methods, the default is for double values (getMin) and
 * the methods with Int in the name are for getting integer values (getMinInt).
 *
 * @author Brennan
 */
public class Range {

    /**
     * Returns the smallest value that was found within a given List.
     *
     * @param l represents a list that contains variables
     * @return returns the minimum value that appeared in the List
     */
    public <T extends Comparable> T getMin(List<T> l) {
        if (l.size() == 0) {
            throw new IllegalArgumentException();
        }
        T min = l.get(0);

        for (int i = 0; i < l.size(); i++) {
            int j = min.compareTo(l.get(i));
            if (j == 1) {
                min = l.get(i);
            }
        }
        return min;
    }

    /**
     * Returns the largest value within the given List.
     *
     * @param l represents a list of variables
     * @return returns the maximum variable value found in the list
     */
    public <T extends Comparable> T getMax(List<T> l) {
        if (l.size() == 0) {
            throw new IllegalArgumentException();
        }
        T max = l.get(l.size() - 1);

        for (int i = 0; i < l.size(); i++) {
            int j = max.compareTo(l.get(i));
            if (j == -1) {
                max = l.get(i);
            }
        }
        return max;
    }

//    /**
//     * Returns the average value that was found within the given List.
//     * 
//     * @param l represents a list of variables
//     * @return returns the average integer value found in the list
//     */
//    public int getAverage(List l) {
//        int sum = 0;
//
//        for (int i = 0; i < l.size(); i++) {
//            sum += (int) l.get(i);
//        }
//        return sum / (int) l.size();
//    }
    public <T> T getAverage(List<T> l) throws Exception{
        // Get average of integers
        if (l.get(0) instanceof Integer) {
            int sum = 0;
            for (int i = 0; i < l.size(); i++) {
                sum += (Integer) l.get(i);
            }
            return (T) ((Integer) (sum / l.size()));

        // Get average of doubles
        } else if (l.get(0) instanceof Double) {
            double sum = 0;
            for (int i = 0; i < l.size(); i++) {
                sum += (Double) l.get(i);
            }
            return (T) ((Double) (sum / l.size()));
        }
        
        throw new Exception ("Type is not supported\n");
    }

}
