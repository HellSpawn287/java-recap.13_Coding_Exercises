public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        boolean range = 13 <= first && first <= 19
                        || 13 <= second && second <= 19
                        || 13 <= third && third <= 19;
        return range;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,13));
        System.out.println(hasTeen(9,19,33));
        System.out.println(hasTeen(9,99,22));
        System.out.println(hasTeen(9,19,13));
    }
}
