/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;
import java.util.Scanner;   // essentially #inlcude <iostream> in c++

/**
 * 
 * @author Brennan
 * date: 1/5/2015
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo\n");
        
        String name = "Brennan";
        double score = 42.5;
        
        // to cast score as an int we just add (int) before score. The double is presented as an integer. Essentially a c++ typecast.
        System.out.printf("Hello %s your score is %d\n", name, (int)score);
        System.out.printf("Hello %s your score is %4d\n", name, (int)score);
        
        // getting user input
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.printf("Your score is %d\n", x);
    }
    
}
