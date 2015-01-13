/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 * Rectangle is a shape object that consists of four sides, an area, and a perimeter.
 * @author bmetzelaar16
 */
public class Rectangle {
    int width;
    int height;

    /**
     * Initialize the width and height of the rectangle.
     * @param width width of rectangle
     * @param height height of rectangle
     * @throws Exception if width or height is initialized as 0, negative, or are equal to each other.
     */
    public Rectangle(int width, int height) throws Exception {
        if ((width <= 0) || (height <= 0)) {    // Checking for 0 and negatives
            throw new Exception ("Rectangle height and width must be above 0.\n");
        } else if (width == height){
            throw new Exception ("Rectangles are not squares, the height and "
                                                 + "width must be different.\n");
        }else {
            this.height = height;
            this.width = width;
        }
    }

    /**
     * Calculates rectangle area (width * height).
     * @return area of rectangle
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle (2 * width * height).
     * @return perimeter of rectangle
     */    
    public double getPerimeter() {
        return 2 * (height * width);
    }
    
    @Override
    public String toString() {
        return "Rectangle\n";
    }
    
    @Override
    public boolean equals(Object o){
        if (o.getClass() != Rectangle.class)
            return false;
        
        Rectangle r = (Rectangle)o;
        return ((r.width == this.width) && (r.height == this.height));
    }
}
