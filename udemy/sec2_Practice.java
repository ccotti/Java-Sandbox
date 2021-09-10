/*Practice for variables, strings, while loops, for loops, do-while loops, If statements, Switch Statements, and getting user input */

import java.util.Scanner;

public class sec2_Practice {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String text = "You have entered ";

        Scanner unum1 = new Scanner(System.in);
        System.out.println("Enter an Integer ");
        num1 = unum1.nextInt();

        Scanner unum2 = new Scanner(System.in);
        System.out.println("Enter another Integer ");
        num2 = unum2.nextInt();

        System.out.println(text + num1 + " and " + num2);
        
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
            
        
        unum1.close();
        unum2.close();

    }


}