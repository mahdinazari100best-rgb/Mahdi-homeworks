package atm.machine;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            while (id < 0 || id > 9) {
                System.out.print("Invalid id. Enter again: ");
                id = input.nextInt();
            }

            Account account = accounts[id];

            while (true) {
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                
                int choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("The balance is " + account.getBalance());
                } 
                else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    account.withdraw(input.nextDouble());
                } 
                else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    account.deposit(input.nextDouble());
                } 
                else if (choice == 4) {
                    break;
                }
            }
        }
    }
}

 class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() { return id; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
}




