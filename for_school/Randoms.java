
import java.util.*;

public class Randoms {

    public static void main(String[] args) {
        Random rand = new Random();

        int a = rand.nextInt();          // Random int
        float b = rand.nextFloat();      // Random float [0.0, 1.0)
        boolean c = rand.nextBoolean();  // Random bool
        int d = rand.nextInt(10);        // Random int between 0 (included) and 10 (excluded)

        System.out.println(a + " ; " + b + " ; " + c + " ; " + d);

        // PRINTS INT (0 or 1)
        for (int i = 0; i < 9; i++) {
            System.out.print(rand.nextInt(2));
        }

        System.out.println();
    }
}
