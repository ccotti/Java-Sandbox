          
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner(new File("/Users/ccotti/workspaces/Java/Java-Sandbox/udemy/Section8_Projects/student_ages.txt"));
            int input;
            int sum = 0;

            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
                sum += input; 
            }// end while

            System.out.println("Sum is " + sum);
            infile.close();
        } 
        catch(FileNotFoundException ex) {
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }//end try-catech
    }//end of main
}
