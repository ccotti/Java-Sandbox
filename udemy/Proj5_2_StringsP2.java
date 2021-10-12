public class Proj5_2_StringsP2 {
    public static void main(String[] args) {
        String myName = "Chris Cottingham";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsN = myName.indexOf("n");

        String LastName = myName.substring(6);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("N is at index " + whereIsN);
        System.out.println("Last name is " + LastName);

    } // end main
} // end class
