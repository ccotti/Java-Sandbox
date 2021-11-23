package Section7_Projects;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Chocolate", 3, 2);
        IceCream yourIC = new IceCream("Strawberry", 2, 1);          
        
        myIC.addTopping("almonds");
        myIC.addTopping("cherries");

        yourIC.addTopping("Chocolate Chips");

        printIC(myIC);
        printIC(yourIC);
        
    }//end main

    public static void printIC(IceCream icecream) {
        System.out.println(icecream.getName());
        System.out.println("Cost: $" + icecream.getCost());
        System.out.println("Topped with: ");
        icecream.printToppings();
        System.out.println();
    }//end printIC

}//end class
