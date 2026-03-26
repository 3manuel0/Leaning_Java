
import java.io.*;
import java.util.*;

public class Exercice {

    public static void main(String[] args) throws IOException {
        String filename = "Notes.txt";
        Random rand = new Random();
        String line;

        try (PrintWriter s = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 5; j++) {
                    s.print(rand.nextInt(21) + " ");
                }
                s.print("\n");
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        try (BufferedReader buff = new BufferedReader(new FileReader(filename))) {
            while ((line = buff.readLine()) != null) {
                String[] parts = line.trim().split(" ");
                float f = 0f;
                for (String n : parts) {
                    f += Float.parseFloat(n);
                }
                System.out.println(f / 5);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
