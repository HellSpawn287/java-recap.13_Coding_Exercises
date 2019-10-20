public class LeapYear {
    private static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year >= 1 && year <= 9999) {
            int divisibleBy4 = year % 4;
            int divisibleBy100 = year % 100;
            int divisibleBy400 = year % 400;
            if ((divisibleBy4 == 0) && !(divisibleBy100 == 0) || (divisibleBy400 == 0)){
                leap = true;
            } return leap;

        }
        return leap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1924));
    }
}
