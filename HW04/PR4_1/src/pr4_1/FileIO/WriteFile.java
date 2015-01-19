/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1.FileIO;

import java.io.BufferedWriter;
import java.io.File;

/**
 * Takes in a file path and writes data given to the object via string to the
 * document at the file path that it was initialized with.
 *
 * @author Brennan
 */
public class WriteFile {

    String filePath = "";

    /**
     * Initialized with a string of the location where the text document
     * resides.
     *
     * @param filePath the file system path for the text document
     */
    public WriteFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Writes the contents of the string to a given file line by line.
     *
     * @param content the string/line that is to be written to the text file
     */
    public void writeString(String content) {
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
