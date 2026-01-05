import java.util.Scanner;

public class atm {
    float balance;
    int pin = 54321;
    
    public void checkpin() {
        System.out.println("Enter your pin:"); 
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin:");
            checkpin(); // Retry pin entry
        }
    }
    
    public void menu() {
        System.out.println("\nSelect the options:");
        System.out.println("1) Check bank balance.");
        System.out.println("2) Withdraw money.");
        System.out.println("3) Deposit money.");
        System.out.println("4) Exit.");
        
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("Thank you for using our ATM!");
            System.exit(0);
        } else {
            System.out.println("Invalid input! Please try again.");
            menu();
        }
    }
    
    public void checkbalance() {
        System.out.println("Balance is: $" + balance);
        menu();
    }
    
    public void withdrawMoney() {
        System.out.println("Enter the amount to withdraw:"); 
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
        menu();
    }
    
    public void depositMoney() {
        System.out.println("Enter the amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float depositamount = sc.nextFloat();
        balance = depositamount + balance;
        System.out.println("Money deposited successfully!");
        System.out.println("New balance: $" + balance);
        menu();
    }
    
    // Main method inside ATM class
    public static void main(String[] args) {
        atm obj = new atm();
        System.out.println("=== Welcome to Java ATM ===");
        obj.checkpin();
    }
}