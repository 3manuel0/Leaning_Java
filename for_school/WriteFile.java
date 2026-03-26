
import java.io.*;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        String filename = "Test.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < 20; i++) {
                writer.println("WRITING LINE " + i);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
