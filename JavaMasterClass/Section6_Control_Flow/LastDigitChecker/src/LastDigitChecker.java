public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            System.out.println("Do any of given numbers (" + firstNumber + ", " + secondNumber + ", " + thirdNumber + ") share a last digit?");
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10));
        }
        System.out.println("Invalid Section6_Control_Flow.input");
        return false;
    }

    public static boolean isValid(int number) {
        if ((number >= 10 && number <=1000)) {
            return true;
        }
        else
            return false;
    }
}