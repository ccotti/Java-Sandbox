public class Proj5_1_StringsP1 {
    public static void main(String[] args) {
        String name = "Chris Cottingham";
        String name2 = "Chris Cottingham";
        String name3 = "Alan Bob";

        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        } // end for

        System.out.println();

        if(name.equals(name2)){
            System.out.println("Names are equal");
        }
        else {
            System.out.println(("Names aren't equal"));
        }

        if(name.compareTo(name3) > 0) {
            System.out.println("name >= name3");
        }
        else {
            System.out.println("name <= name3");
        }

    } // end main
} // end class
