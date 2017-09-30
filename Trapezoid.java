/**
 * Created by computerlab on 9/18/14.
 */
import java.util.Scanner;
public class Trapezoid {
    public static void main(String[] args) {
        int base1;
        int base2;
        int height;
        int basesum;

        Scanner input = new Scanner (System.in);
        System.out.println ("Please input base 1: ");
        base1 = input.nextInt();
        System.out.println ("Please input base 2: ");
        base2 = input.nextInt();
        System.out.println ("Please input height: ");
        height = input.nextInt();

        basesum = base1+base2;
        int area = basesum * height / 2;

        System.out.println ("The area of the trapezoid is: " + area);
    }
}
