/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brennan
 */
public class ReadFile {

    File file;
    final String filePath;
    List<String> contents = new ArrayList<String>();

    public ReadFile(String filePath) {
        this.filePath = filePath;
    }

    // Returns a list of strings. Each itteration of the list is a new line.
    public void readFile() {
        file = new File(filePath);

        try {
            BufferedReader rdr = new BufferedReader(new FileReader(file));
            contents = new ArrayList<String>();
            String line;

            while ((line = rdr.readLine()) != null) {
                contents.add(line);
            }
            rdr.close();

        } catch (FileNotFoundException e) {
            System.out.print("ERROR: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: ");
            System.out.println(e.getMessage());
        }
    }

    public List<String> getContents() {
        return contents;
    }
}
