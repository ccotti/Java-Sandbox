public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || start > end || end < 0 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int n = start; n <= end; n++) {
            if (isOdd(n)) {
                sum += n;
            }
        }
        return sum;
    }
}
