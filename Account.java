package the.account.pkgclass;
import java.util.Date;

public class Account {
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int i, double b) {
        id = i;
        balance = b;
        dateCreated = new Date();
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.annualInterestRate = 4.5;
        
        account.withdraw(2500);
        account.deposit(3000);
        
        System.out.println("Balance: $" + account.balance);
        System.out.println("Monthly interest: $" + account.getMonthlyInterest());
        System.out.println("Date created: " + account.dateCreated);
    }
}