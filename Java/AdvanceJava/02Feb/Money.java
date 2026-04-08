// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("__ Bank Account __\n");

        Scanner sc = new Scanner(System.in);

        // Create new accounts
        System.out.print("Enter account balance: ");
        int bal = sc.nextInt();

        BankAccount bnk = new BankAccount(bal);         // Constructor of BankAccount
        SavingsAccount svg = new SavingsAccount(bal);   // Constructor of SavingAccount

        // Withdrawl
        System.out.print("Enter amount to withdraw: ");
        int w = sc.nextInt();

        // Normal bank
        System.out.println("\nNormal Account:");
        bnk.withdraw(w);

        // Wont allow balance less than 100
        System.out.println("\nSaving Account:");
        svg.withdraw(w);
    }
}

class BankAccount {
    int balance;

    public BankAccount(int bal) {
        this.balance = bal;

    }

    void deposit(int amt) {
        this.balance = balance+amt;
        System.out.println("\nDeposited " + amt);
        System.out.println("Current balance " + this.balance);

    }

    void withdraw(int amt) {
        this.balance = balance-amt;
        System.out.println("withdrew " + amt);
        System.out.println("Current balance " + this.balance);

    }
}

// wont allow withdraw if balance is less than 100
class SavingsAccount extends BankAccount{
    public SavingsAccount(int bal) {
        super(bal);
    }

    void withdraw(int amt) {                                // override
        if ((super.balance-amt) < 100) {
            System.out.println("insufficient balance");     // min balance check
        } else {
            this.balance = balance-amt;
            System.out.println("withdrew " + amt);
            System.out.println("Current balance " + this.balance);           
        }
    }
    
}