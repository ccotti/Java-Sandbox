import java.util.Scanner;

public class Proj5_2_StringsP2 {
    public static void main(String[] args) {
        String myName = "Chris Cottingham";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsSP = myName.indexOf(" ");

        String LastName = myName.substring(whereIsSP);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("The space is at index " + whereIsSP);
        System.out.println("Last name is " + LastName);

        String fullName;
        String firstName;
        String lastName;

        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("What is your full name?");
        fullName = keyboard.nextLine();

        int indexOfSpace = fullName.indexOf(" ");

        firstName = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);

        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();

        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);

        keyboard.close();
    } // end main
} // end class
