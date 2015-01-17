/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3.FileIO;

import java.io.BufferedWriter;
import java.io.File;

/**
 *
 * @author Brennan
 */
public class WriteFile {
    // File f;
    String filePath = "";
    
    
    public WriteFile (String filePath) {
    this.filePath = filePath;
}
    
    public void writeString(String content){
        File f = new File(filePath);
        try {
            BufferedWriter wrtr = new BufferedWriter(new java.io.FileWriter(f, true));
            wrtr.write(content);
            wrtr.newLine();
            wrtr.close();
        } catch (Exception e) {
            System.out.println("ERROR: Writing To File");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
    }
    
}
