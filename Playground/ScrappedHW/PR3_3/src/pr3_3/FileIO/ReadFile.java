/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Brennan
 */
public class ReadFile {
    String filePath = "";
    
    public ReadFile(String filePath) {
        this.filePath = filePath;
    }
    
    public List<String> getRegPatterns(List<String> stringPattern) {
        File f = new File(filePath);
        List<String> found = new ArrayList<String>();
        
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;

            while ((line = rdr.readLine()) != null) {
                
                for (int i = 0; i < stringPattern.size(); i++){
                    Pattern p = Pattern.compile(stringPattern.get(i));
                    Matcher m = p.matcher(line);
                    while (m.find()) {
                        found.add(m.group(1)); //)tempName = m.group(1);
                    }
                }
            }
            rdr.close();

        } catch (Exception e) {
            System.out.println("ERROR: Reading From File");
            System.out.print("MSG: ");
            System.out.println(e.getMessage());
        }
        return found;
    }
}
