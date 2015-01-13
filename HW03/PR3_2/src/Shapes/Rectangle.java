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
public class Rectangle {
    int width;
    int height;
    
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    
    public double getArea(){
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (height * width);    
    }
}
