/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;

import java.util.Scanner;
// import java.text.DecimalFormat;
import java.lang.Math;

/**
 * HW01<br>
 * PR1_4: Area of a Circle
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

class Circle {

    static final double PI = 3.14;
    double radius = 0;
    double area = 0;

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        radius = Math.pow(radius, 2) * PI;
        return radius;
    }
}
