/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.*; // Scanner, List, ListArray

/**
 *
 * @author Brennan
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List l = new ArrayList();
        // int[] arr = new int[10];
        Range vr = new Range();
        

        System.out.println("Enter 10 numbers:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            l.add(input.nextInt());
            
            // arr[i] = input.nextInt();
        }
        System.out.println("Here is some data about your numbers:");
        System.out.printf("The max number is %d\n", (int)vr.getMaxInt(l));
        System.out.printf("The min number is %d\n", (int)vr.getMinInt(l));
        System.out.printf("The average number is %d\n", (int)vr.getAverageInt(l));

        
    }
}
