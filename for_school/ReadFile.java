
import java.io.*;
// READING FILES 

public class ReadFile {

    public static void main(String args[]) throws IOException {
        String filename = "test.txt";
        int ligne; // To store a byte we currently reading 
        try (BufferedReader buff = new BufferedReader(new FileReader(filename))) {
            while ((ligne = buff.read()) != -1) {
                System.out.println(ligne);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
