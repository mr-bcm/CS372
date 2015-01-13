/*
 * HW03-PR3_2: Shape Class Hierarchy
 * By: Brennan Metzelaar
 * Edited: 1/13/2015
 * Due: 1/13/2015
 */
package pr3_2;

import Shapes.*;

/**
 * MAIN CLASS - Given dimensions of triangle, rectangle, and ellipse output the 
 * area and perimeter of each.
 * @author bmetzelaar16
 */
public class PR3_2 {

    /**
     * Shape objects (rectangle, triangle, and ellipse) have their area and 
     * perimeter output based on their dimensions.
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(2, 8);
            Triangle triangle = new Triangle(3, 4, 5);
            Ellipse ellipse = new Ellipse(5, 8);

            System.out.printf("Rectangle: area = %.2f, perimeter = %.2f\n", rectangle.getArea(), rectangle.getPerimeter());
            System.out.printf("Triangle: area = %.2f, perimeter = %.2f\n", triangle.getArea(), triangle.getPerimeter());
            System.out.printf("Ellipse: area = %.2f, perimeter = %.2f\n", ellipse.getArea(), ellipse.getPerimeter());
        } catch (Exception e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
    }

}
