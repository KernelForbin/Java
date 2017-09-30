/**
 * Created by computerlab on 9/18/14.
 */
public class MyWork {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 == 0)
                System.out.println("The number " + i + " is even");
            else
                System.out.println("The number " + i + " is odd");
        }

    }
}