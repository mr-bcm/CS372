/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;
import java.lang.Math;

/**
 * An object that represents the characteristics of a circle.
 * @author Brennan
 */
public class Circle {

    static final double PI = 3.14;
    double radius = 0;
    double area = 0;
    
    /**
     * Default constructor
     */
    public Circle(){}
    
    /**
     * Initializes the circle's radius.
     * @param r new radius value.
     */
    public Circle(double r){
        radius = r;
    }

    /**
     * Sets the <code>Circle</code> object's radius to the value that is given, <code>r</code>.
     * @param r new radius value for the circle
     */
    public void setRadius(double r) {
        radius = r;
    }

    /**
     * Calculates a circle's area based off of its radius.
     * @return the circle's area
     */
    public double getArea() {
        radius = Math.pow(radius, 2) * PI;
        return radius;
    }
}
