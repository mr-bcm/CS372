/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 * Ellipse is a shape object that consists of two radii, an area, and a perimeter.
 * 
 * @author bmetzelaar16
 */
public class Ellipse extends Shape {
    int r1;  // radius 1
    int r2;  // radius 2

    /**
     * Initializes ellipse radius 1 and 2 with values.
     * @param r1 first radius
     * @param r2 second radius
     * @throws Exception if either radius 1 or 2 is set to 0 or negative
     */
    public Ellipse(int r1, int r2) throws Exception {
        if ((r1 <= 0) || (r2 <= 0)) {
            throw new Exception("Ellipse radius 1 and 2 must be above 0.");
        } else {
            this.r1 = r1;
            this.r2 = r2;
        }
    }

    /**
     * Calculate the area of the ellipse based on radius 1 (r1) and radius 2 (r2).
     * @return area of ellipse
     */
    public double getArea() {
        return Math.PI * r1 * r2;   // for an ellipse centered at origin
    }

    /**
     * Calculate perimeter of the ellipse using radius 1 (r1) and radius 2 (r2).
     * @return the ellipse perimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(r1, 2) + Math.pow(r2, 2)) / 2); // One of many formulas
    }

    @Override
    public String toString() {
        return "Ellipse\n";
    }
    
    @Override
    public boolean equals(Object o){
        if (o.getClass() != Ellipse.class){
            return false;
        }
        
        Ellipse e = (Ellipse)o;
        return ((e.r1 == this.r1) && (e.r2 == this.r2));
    }
}
