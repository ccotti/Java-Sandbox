public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        if (a==b) {
            return true;
        }
        else
            return false;
    }
}
