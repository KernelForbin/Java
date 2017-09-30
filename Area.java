/**
 * Created by computerlab on 9/18/14.
 */
import java.util.Scanner;
public class Area {
    public static void main (String[] args) {
        int side;
        int area;

        System.out.println("Please enter the side: ");
        Scanner input = new Scanner (System.in);
        side = input.nextInt();

        area = side * side;

        System.out.println("The area of the square is: " + area);
    }
}
