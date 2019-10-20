public class EqualSumChecker {
    public static boolean hasEqualSum(int first, int second, int sum){
        boolean isEqual;
        return isEqual= ((first + second) == sum);
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
}
