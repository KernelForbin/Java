/**
 * Created by Kenny Mitchell on 10/2/14.
 *
 * Imagine a financial instrument which moves up or down with equal probabilty. The instrument begins
 * with a value of v = 0 at ime t= 0. Each turn the value of v either increases or decreases by 1.
 *
 * 1) one integer variables v;
 * 2) two assessor methods, getValue(), setValue();
 * 3) a method calculateNewValue() which computes the new value and updates the variable v;
 */
import java.util.Random;
class RandomWalkFinancial {

        private int v = 0;
            public int getV() {
                return v;
            }

            public void setV(int value) {
                v = value;
            }

        public void calculateNewValue()    {

               Random random = new Random();

                int result = 0;

                result = random.nextInt(2);
                if (result == 0) {
                    v++;
                } else {
                    v--;
                }
        }

}