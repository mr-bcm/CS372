/*
 * Testing at:
 * https://www.regex101.com/
 *
 * Catches everything that starts with <name>;
 * and ends with ;
 * Ex, <name>;Diego the fast;
 * You will get: Diego the fast
 * <name>\;(.*)?\;
 * 
 * <name\>(.*)?\;
 * catch everything after <name>
 * but before ;
 * 
 * Better Below
 * <name\>(.*)?\<done>
 * enclose statements to capture between <name> <done>
 * Example <name>Event of the Gods!<done>
 * Gives us: Event of the Gods!
 */

package fileiotest;
import java.io.*;
import java.util.regex.*;
/**
 *
 * @author bmetzelaar16
 */
public class FileIOTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // File f = new File("C:\\Users\\bmetzelaar16\\Desktop\\samplefile.txt");
        File f = new File("C:\\Users\\Brennan\\Documents\\GitHub\\CS372\\Playground\\samplefile.txt");

        try{
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null){
                Pattern p = Pattern.compile("<name\\>(.*)?\\<1done>");
                Matcher m = p.matcher(line);
                while(m.find()){
                    System.out.println(m.group(1));
                }
                
                Pattern p2 = Pattern.compile("<location\\>(.*)?\\<2done>");
                Matcher m2 = p2.matcher(line);
                while(m2.find()){
                    System.out.println(m2.group(1));
                }
                
                Pattern p3 = Pattern.compile("<date\\>(.*)?\\<3done>");
                Matcher m3 = p3.matcher(line);
                while(m3.find()){
                    System.out.println(m3.group(1));
                }
            }
                System.out.println(line);
            rdr.close();
        } catch (Exception e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
    }
    
}
