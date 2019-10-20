public class BarkingDog {
    public static boolean bark(boolean barking, int hourOfTheDay) {
        boolean wakeUp = false;
        if (barking == true) {

            if (hourOfTheDay < 0 || hourOfTheDay > 23) {
                return wakeUp = false;
            } else if (hourOfTheDay < 8 || hourOfTheDay > 22) {
                return wakeUp = true;
            } else {
                return wakeUp;
            }
        } return wakeUp;
    }

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println(bark(true, 0));
    }
}
