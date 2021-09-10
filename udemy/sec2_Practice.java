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
        
        unum1.close();
        unum2.close();

    }


}