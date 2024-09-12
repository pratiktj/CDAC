package assignment4;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
    
	private LoanAmortizationCalculator calculator;

    
    public void acceptRecord() {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount (₹): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter the loan term (years): ");
        int loanTerm = sc.nextInt();

        calculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

   
    public void printRecord() {
        System.out.println(calculator);
    }

   
    public void menuList() {
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println("3. Exit");
    }
}
