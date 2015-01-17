// Original ValueRange has been turned into a text file with this version
// replacing it. The old version did not have static methods and did not support
// generic type T. Also, rather than l.size() == 0 I am now doing 
// l.isEmpty().
package pr2_6;

import java.util.*;

/**
 * Contains generic methods for calculating the minimum, maximum, and average values
 * within a List.
 * <p>
 * Min and max have their own generic methods, however average consists of two
 * methods, one being for integers and the other for doubles.
 *
 * @author Brennan
 */
public class ValueRange {
    /**
     * Returns the smallest value that was found within a given List.
     *
     * @param <T> list of values
     * @param l represents a list that contains variables
     * @return returns the minimum value that appeared in the List
     */
    public static <T extends Comparable> T getMin(List<T> l) {
        if (l.isEmpty()) {
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
     * @param <T> list of values
     * @param l represents a list of variables
     * @return returns the maximum variable value found in the list
     */
    public static <T extends Comparable> T getMax(List<T> l) {
        if (l.isEmpty()) {
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

    /**
     * Returns the average value found within the given list as a double.
     * 
     * @param l represents a list of double variables
     * @return returns the average double value that appeared in the List
     */
    public static double getAverageDouble(List l) {
        double sum = 0;

        for (int i = 0; i < l.size(); i++) {
            sum += (double) l.get(i);
        }
        return sum / (double) l.size();
    }

    /**
     * Returns the average value found within the given list as an integer.
     * 
     * @param l represents a list of integer variables
     * @return returns the average integer value that appeared in the List
     */
    public static int getAverageInt(List l) {
        int sum = 0;

        for (int i = 0; i < l.size(); i++) {
            sum += (int) l.get(i);
        }
        return sum / (int) l.size();
    }
}
