/*
 * HW01
 * PR1_4: Area of a Circle
 */
package pr1_4;

import java.util.Scanner;
// import java.text.DecimalFormat;
//import java.lang.Math;

/**
 * The class asks the user for a radius and outputs the area of a circle based
 * on the radius that was given.
 *
 * @author Brennan
 * @since 1/6/2014
 */
public class PR1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area Of A Circle");
        System.out.printf("What is the radius?: ");

        Circle circle1 = new Circle();
        circle1.setRadius(input.nextInt());

        //DecimalFormat f = new DecimalFormat("#.00");
        System.out.printf("The area of your circle is %s", circle1.getArea());
        System.out.println();
    }
}
