/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;

import java.util.*;

/**
 * Contains methods for calculating the minimum, maximum, and average values
 * within a List.
 * 
 * @author Brennan
 */
public class ValueRange {

    /**
     * Returns the smallest value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the minimum value that appeared in the List
     */
    public double getMin(List l) {
        double min = Double.MAX_VALUE;

        for (int i = 0; i < l.size(); i++) {
            if (min > (double) l.get(i)) {
                min = (double) l.get(i);
            }
        }
        return min;
    }

    /**
     * Returns the largest value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the maximum value that appeared in the List
     */
    public double getMax(List l) {
        double max = Double.MIN_VALUE;
        
        for (int i = 0; i < l.size(); i++){
            if (max < (double) l.get(i)){
                max = (double) l.get(i);
            }
        }
        return max;
    }

    /**
     * Returns the average value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the average value that appeared in the List
     */
    public double getAverage(List l) {
        double sum = 0;

        for (int i = 0; i < l.size(); i++) {
            sum += (double) l.get(i);
        }
        return sum / (double) l.size();
    }
}
