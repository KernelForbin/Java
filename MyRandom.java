/**
 * Created by computerlab on 9/18/14.
 */
import java.util.Random;
public class MyRandom {
    public static void main(String[] args) {
        Random generator = new Random ();

        int number;

        number = generator.nextInt(3);
        if (number == 0) {
            System.out.println("Hello");
        }
        else if (number == 1) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println ("Hola");
        }

    }
}
