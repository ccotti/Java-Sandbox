package Section7_Projects;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John Baugh", 5000);
        BankAccount bobsAccount = new BankAccount("Bob Robinson");
       
        bobsAccount.deposit(500);
        System.out.println("Owner: " + bobsAccount.getOwner());
        System.out.println("balance: " + bobsAccount.getBalance());

        bobsAccount.withdraw(1000); //warning!
        System.out.println("Owner: " + bobsAccount.getOwner());
        System.out.println("balance: " + bobsAccount.getBalance());
        System.out.println();

        System.out.println("owner: " + myAccount.getOwner());
        System.out.println("Balance: " + myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000?");
        myAccount.deposit(1000);

        System.out.println("owner: " + myAccount.getOwner());
        System.out.println("Balance: " + myAccount.getBalance());
    }// end main
}//end class
