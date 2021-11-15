
//Need to Fix -- NOT working

package Section6_Projects;

import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    }// end of main

    public static void runGame() {
        String winner = "";
        boolean xTurn = true;
        int theRow = 0;
        int theCol = 0;
        String[][] gameBoard = new String[3][3];

        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);
        
        while(winner.equals("")) {
            if(xTurn) {
                System.out.println("It is X's turn");
            }
            else {
                System.out.println("It is O's turn");
            }// end if-else

            getUserInput(xTurn, gameBoard);
            System.out.println(); // extra space

            printCurrentBoard(gameBoard);
            winner = getWinner(gameBoard);
            xTurn = !xTurn;   //flip it

            if(winner.equals("") && isBoardFull(gameBoard)); {
                winner = "C";
            }//end if
        }// end while

        //cat's game?
        System.out.println();
        if(winner.equals("C")) {
            System.out.println("It was the Cat's game! No Winner!");
        }
        else {
            System.out.println("The winner is " + winner);
        }// end if-else
    }// end runGame

    public static void initializeGameBoard(String[][] gameBoard) {
        
    }// end initializeGameBoard

    public static void printCurrentBoard(String[][] gameBoard) {

    }// end printCurrentBoard

    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);

        int row = -1;
        int col = -1;
        boolean keepAsking = true;

        while(keepAsking) {
            System.out.println("Please enter the row THEN the column, each from 0, 1, or 2, seperated by a space");

            row = keyboard.nextInt();
            col = keyboard.nextInt();
            keyboard.nextLine();
        }
    }//end of getUserInput

    public static String getWinner(String[][] gameBoard) {
        return "";
    }//end getWinner

    public static boolean isBoardFull(String[][] gameBoard) {
        return false;
    }// end isBoardFUll

}// end of class
