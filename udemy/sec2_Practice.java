/*Practice for variables, strings, while loops, for loops, do-while loops, If statements, Switch Statements, and getting user input */

import java.util.Scanner;

public class sec2_Practice {

    public static void main(String[] args) {
        // Variables & Strings
        int num1 = 0;
        int num2 = 0;
        int j = 0;
        String text = "You have entered ";

        // User Input
        Scanner unum1 = new Scanner(System.in);
        System.out.println("Enter an Integer ");
        num1 = unum1.nextInt();

        Scanner unum2 = new Scanner(System.in);
        System.out.println("Enter another Integer ");
        num2 = unum2.nextInt();

        System.out.println(text + num1 + " and " + num2);
        
        // If Statement
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
        
        // For Loop
        for(int i = 1; i <= num1; i++) {
            System.out.println("The value of i is " + i);
        }

        // Do-while loop
        do {
            System.out.println("The value of j is " + j);
            j++;
        }
        while (j < num2);

        // While Loop
        while(j < num1){
            System.out.println(j + " is still less than " + num1);
            j++;
        }

        // Switch Loop
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String ipText = input.nextLine();

        switch(ipText) {
            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine stopped!");
                break;

                default:
                System.out.println("Command not recognized");
        }

        unum1.close();
        unum2.close();
        input.close();

    }


}