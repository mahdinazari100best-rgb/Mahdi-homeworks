package loan.pkgclass;
import java.util.Date;

 class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private Date loanDate;
    
    public Loan() {
        loanDate = new Date();
    }
    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public int getNumberOfYears() {
        return numberOfYears;
    }
    
    public double getLoanAmount() {
        return loanAmount;
    }
    
    public Date getLoanDate() {
        return loanDate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    public double getMonthlyPayment() {
        double monthlyRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyRate / (1 - (1 / Math.pow(1 + monthlyRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

public class TestLoan {
    public static void main(String[] args) {
        Loan loan = new Loan(5.5, 5, 10000);
        System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        System.out.println("Total Payment: " + loan.getTotalPayment());
        System.out.println("Loan Date: " + loan.getLoanDate());
    }
}