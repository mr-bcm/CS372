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
 * <p> There are two sets of methods, the default is for double values (getMin) 
 * and the methods with Int in the name are for getting integer values 
 * (getMinInt).
 * 
 * @author Brennan
 */
public class Range {
    
    /**
     * Returns the smallest double value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the minimum double value that appeared in the List
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
     * Returns the largest double value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the maximum double value that appeared in the List
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
     * Returns the average double value that was found within a given List.
     * 
     * @param l represents a list that contains double variables
     * @return returns the average double value that appeared in the List
     */
    public double getAverage(List l) {
        double sum = 0;

        for (int i = 0; i < l.size(); i++) {
            sum += (double) l.get(i);
        }
        return sum / (double) l.size();
    }

    // BELOW IS FOR INTEGER VALUES
    
    /**
     * Returns the smallest integer value that was found within a given List.
     * 
     * @param l represents a list that contains integer variables
     * @return returns the minimum integer value that appeared in the List
     */
    public int getMinInt(List l) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < l.size(); i++) {
            if (min > (int)l.get(i)) {
                min = (int)l.get(i);
            }
        }
        return min;
    }

    /**
     * Returns the largest integer value that was found within a given List.
     * 
     * @param l represents a list that contains integer variables
     * @return returns the maximum integer value that appeared in the List
     */
    public int getMaxInt(List l) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < l.size(); i++){
            if (max < (int) l.get(i)){
                max = (int) l.get(i);
            }
        }
        return max;
    }

    /**
     * Returns the average integer value that was found within a given List.
     * 
     * @param l represents a list that contains integer variables
     * @return returns the average integer value that appeared in the List
     */
    public int getAverageInt(List l) {
        int sum = 0;

        for (int i = 0; i < l.size(); i++) {
            sum += (int) l.get(i);
        }
        return sum / (int) l.size();
    }
    
    
    
// GENERIC TYPE
    
//    public T getMin(List<T> l) {
//        // T min = Double.MAX_VALUE;
//
//        T min = l.get(0);
//        
//        for (int i = 0; i < l.size(); i++) {
//            if (min > l.get(i)) {
//                min = (T) l.get(i);
//            }
//        }
//        return min;
//    }
    
}
