//: c02:PR1_2.java
package pr1_3;

/**
 * This class consists of HW01 problem PR1_2 and it only contains one function,
 * main().
 *
 * @author Brennan Metzelaar
 * @since 1/6/2015
 */
public class PR1_3 {

    /**
     * If the method receives arguments, then the first three arguments will be
     * output.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There were no command line arguments.");
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
}
