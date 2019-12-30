/*
package Unit03;
import java.util.Scanner;

public class Ch3Lab1 {
	public static void main(String[] args) {
		// Identifying variables
		double radius;
		double area;
		double circumference;
		char choice;
		
		// Getting User Input
		Scanner scrn = new Scanner(System.in);
		System.out.print("Please enter a radius (feet): ");
		radius = scrn.nextDouble();
		System.out.print("Enter A (Area) or C (Circumference): ");
		choice = scrn.next().charAt(0);
				
		// Determining user choice and calculating based on choice
		if (choice == 'a' || choice == 'A') {
			area = Math.PI * (radius * radius);
			System.out.printf("Area: " + area + " feet");		
		}
		else if (choice == 'c' || choice == 'C') {
			circumference = 2 * Math.PI * radius;
			System.out.printf("Circumference: " + circumference + " feet");
		}
		else
			System.out.print("I'm sorry, I did not understand your choice.");
		
		scrn.close();
	}
}
*/

