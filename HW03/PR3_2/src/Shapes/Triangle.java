/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 * Triangle is a shape object that consists of three sides, an area, and a
 * perimeter.
 *
 * @author bmetzelaar16
 */
public class Triangle {
    int s1, s2, s3;

    /**
     * Initialize the sides of a triangle.
     *
     * @param s1 triangle side 1
     * @param s2 triangle side 2
     * @param s3 triangle side 3
     * @throws Exception triangle side is initialized as 0 or negative, or the
     * triangle fails to pass the inequality theorem.
     */
    public Triangle(int s1, int s2, int s3) throws Exception {
        if ((s1 <= 0) || (s2 <= 0) || (s3 <= 0)) {  // Check for 0 and negatives
            throw new Exception("Triangle side cannot be 0 or less.\n");
        } else if (s1 + s2 < s3) { // Triangle Inequality Theorem
            throw new Exception("Triangle side 1 and 2 cannot have a sum less than side 3.\n");
        } else if (s1 + s3 < s2) { // -
            throw new Exception("Triangle side 1 and 3 cannot have a sum less than side 2.\n");
        } else if (s2 + s3 < s1) { // -
            throw new Exception("Triangle side 2 and 3 cannot have a sum less than side 1.\n");
        } else {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
    }

    /**
     * Calculate area of a triangle using all three sides and Heron's formula.
     * @return area of triangle
     */
    public double getArea() {
        double p = getPerimeter() / 2.0;
        
        return Math.sqrt((p * (p - s1) * (p - s2) * (p - s3)));
    }

    /**
     * Calculate the perimeter of the triangle using sides 1, 2, and 3.
     *
     * @return triangle perimeter
     */
    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return "Triangle\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Triangle.class) {
            return false;
        }

        Triangle t = (Triangle) o;
        return ((t.s1 == this.s1) && (t.s2 == this.s2) && (t.s3 == this.s3));
    }

}
