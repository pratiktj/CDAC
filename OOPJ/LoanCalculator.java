package assignment3;

import java.util.Scanner;

public class LoanCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;
    private double monthlyPayment;
    private double totalPayment;

     
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount (₹): ");
        principal = sc.nextDouble();
        System.out.println("Enter the annual interest rate (%): ");
        annualInterestRate = sc.nextDouble();
        System.out.println("Enter the loan term (years): ");
        loanTerm = sc.nextInt();
    }

    
    public void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                         (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        totalPayment = monthlyPayment * numberOfMonths;
    }

    public void printRecord() {
        System.out.printf("Monthly payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total payment over the life of the loan: ₹%.2f%n", totalPayment);
    }

    public static void main(String[] args) {
        LoanCalculator calculator = new LoanCalculator();
        calculator.acceptRecord();
        calculator.calculateMonthlyPayment();
        calculator.printRecord();
    }
}
