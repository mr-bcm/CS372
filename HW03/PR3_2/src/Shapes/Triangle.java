/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Shapes;

/**
 *
 * @author bmetzelaar16
 */
public class Triangle {
    int s1, s2, s3;
    
    public Triangle (int s1, int s2, int s3){
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
}
