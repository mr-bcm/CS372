/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;
import java.io.*;

/**
 *
 * @author bmetzelaar16
 */
public class Triangle {

    int s1, s2, s3;

    public Triangle(int s1, int s2, int s3) throws Exception {
        
        if ((s1 <= 0) || (s2 <= 0) || (s3 <= 0)) {
            throw new Exception ("A side cannot be 0 or less.\n");
        } else if (s1 + s2 > s3) { // Triangle Inequality Theorem
            throw new Exception ("The sum of side 1 and 2 cannot be greater than side 3.\n");
        } else if (s1 + s3 > s2) { // -
            throw new Exception ("The sum of side 1 and 3 cannot be greater than side 2.\n");
        } else if (s2 + s3 > s1) { // -
            throw new Exception ("The sum of side 2 and 3 cannot be greater than side 1.\n");
        }

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return "A Legal Triangle";
    }

}
