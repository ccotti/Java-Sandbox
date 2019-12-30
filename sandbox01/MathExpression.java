
import java.util.Scanner;

public class MathExpression {
	public static void main (final String[] args) {
		final Scanner scnr = new Scanner(System.in);
		char operator;
		int number1;
		int number2;

		System.out.print("Enter a math expression: ");

		// input string
		// Separate string into num1 and num2 based on character
		// for example, 2 * 3 == num1 = 2, num2 = 3 and * means multiply the two
		// together
		number1 = scnr.nextLine().charAt(0);
		operator = scnr.nextLine().charAt(1);
		number2 = scnr.nextLine().charAt(2);

		switch (operator) {
		case '^':
			// casting int to double for calculations
			final double n1 = number1;
			final double n2 = number2;
			double raised;

			raised = Math.pow(n1, n2);
			System.out.println(number1 + " raised to the " + number2 + " is " + raised);
			break;
		case '#':
			final double sqr1 = number1;
	      		double sqrtNum;
	      		
	      		sqrtNum = Math.sqrt(sqr1);
	      		System.out.println("The square root of " + number1 + " is " + sqrtNum);
	      		break;
	      	default:
	      		System.out.println("Not working");
	      		
	      }
	      
	      
	      scnr.close();
	  }
}

