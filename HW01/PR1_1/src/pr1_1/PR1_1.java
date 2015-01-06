/*
 * HW01-PR1_1: Date Only
 * By: Brennan Metzelaar
 * Edited: 1/6/2015
 * Due: 1/6/2015
 */
package pr1_1;

import java.util.*;

public class PR1_1 {

    /**
     * Sole entry point to class & application
     *
     * @param args array of string arguments
     * @return No return value
     * @exception exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());

        DataOnly initTest = new DataOnly();
        initTest.set(5, 2.8f, false);

        System.out.println();   // add newline
        System.out.println("DataOnly object data:");
        System.out.println(initTest.i);
        System.out.println(initTest.f);
        System.out.println(initTest.b);
    }

} ///:~

// New class
class DataOnly {

    int i;
    float f;
    boolean b;

    // method to set the DataOnly values
    void set(int num, float decNum, boolean yesNo) {
        i = num;
        f = decNum;
        b = yesNo;
    }
}
