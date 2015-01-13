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
public class Ellipse extends Shape {
    int r1;  // radius 1
    int r2;  // radius 2
    
    public Ellipse(int r1, int r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    
    public double getArea(){return 0;}
    public double getPerimeter() {return 0;}

}
