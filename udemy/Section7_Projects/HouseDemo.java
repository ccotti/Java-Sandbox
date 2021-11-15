package Section7_Projects;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3,10,"blue");

        myHouse.setNumStories(3);
        myHouse.setNumWindows(8);
        myHouse.setColor("green");

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);

        // yourHouse.setNumStories(2);
        // yourHouse.setNumWindows(6);
        // yourHouse.setColor("blue");

        // System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStoreies() + " stories and " + myHouse.getNumWindows() + " windows.");
        // System.out.println();

        // System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.getNumStoreies() + " stories and " + yourHouse.getNumWindows() + " windows.");
        // System.out.println();

    }// end main

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() + 
        "\nand has " + house.getNumStoreies() + " stories and " + 
        "\n" + house.getNumWindows() + " windows.");
    }// end printHouseData

}// end HouseDemo
