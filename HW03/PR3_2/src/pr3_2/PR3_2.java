/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import Shapes.*;

/**
 *
 * @author bmetzelaar16
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Rectangle rectangle = new Rectangle(5, 8);
        Triangle triangle = new Triangle(0, 5, 4);
        
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getPerimeter());
        } catch (Exception e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
    }
    
}
