
import java.util.Scanner;

public class ExtractUsername {
	public static void main(String [] args) {
	      Scanner scnr = new Scanner(System.in);
	      String emailText;
	      int atSymbolIndex;
	      String emailUsername;
	      String userSSN;
	      String lastFour;

	      System.out.print("Enter email address: ");
	      emailText = scnr.nextLine();

	      atSymbolIndex = emailText.indexOf('@');
	      if (atSymbolIndex == -1) {
	         System.out.println("Address is missing @");
	      }
	      else {
	         emailUsername = emailText.substring(0, atSymbolIndex);
	         System.out.println("Username: " + emailUsername);
	      }
	      
	      System.out.print("Enter your SSN: ");
	      userSSN = scnr.nextLine();
	      // Returns last 4: ".com"
	      lastFour = userSSN.substring(userSSN.length() - 4, userSSN.length());
	      System.out.println("Last 4 of SSN: " + lastFour);
	      
	      scnr.close();
	 }
}