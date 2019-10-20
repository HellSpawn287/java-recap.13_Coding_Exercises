import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        MathContext mathContext = new MathContext(4, RoundingMode.DOWN);
        BigDecimal bdFirst = BigDecimal.valueOf(first).abs(mathContext);
        BigDecimal bdSecond = BigDecimal.valueOf(second).abs(mathContext);

        System.out.println("First: \t" + bdFirst + "\t second: \t " +bdSecond);
        boolean areEqual;
        if (bdFirst.equals(bdSecond)) {
            areEqual = true;
        } else {
            areEqual = false;
        }

        return areEqual;
    }

    /* >>>---Easy WAY---<<<
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        return ((int)(number1 * 1000) == (int)(number2 * 1000));
    }
    * */

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756d, -3.175d));
        System.out.println(areEqualByThreeDecimalPlaces(3.175d, 3.176d));
        System.out.println(areEqualByThreeDecimalPlaces(3.000000000, 3.0000000));
        System.out.println(areEqualByThreeDecimalPlaces(0.333678, 0.33678));
    }
}
