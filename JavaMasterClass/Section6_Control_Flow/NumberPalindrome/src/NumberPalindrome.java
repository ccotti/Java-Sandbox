public class NumberPalindrome {

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }// end of main

    public static boolean isPalindrome (int number) {
        int reversedNum = 0;
        int lastDigit = 0;

        int num = number;

        while(number != 0){
            lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }

        if(reversedNum == num) {
            System.out.println("It's a palindrome");
            return true;
        } else

            System.out.println("Not a palindrome");
        return false;
    }
} // end of class
