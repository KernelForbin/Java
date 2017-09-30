/**
 * Created by Kenny Mitchell on 10/2/14.
 */
public class RandomWalkFinancialDriver {
    public static void main (String[] args) {
        RandomWalkFinancial x = new RandomWalkFinancial();

        int i = 0;

        while (i < 100) {
            x.calculateNewValue();
            System.out.println(x.getV());
            i++;
        }
    }
}