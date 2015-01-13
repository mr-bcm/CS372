/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileiotest;
import java.io.*;
/**
 *
 * @author bmetzelaar16
 */
public class FileIOTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("C:\\Users\\bmetzelaar16\\Desktop\\samplefile.txt");
        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null)
                System.out.println(line);
            rdr.close();
        } catch (Exception e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
    }
    
}
