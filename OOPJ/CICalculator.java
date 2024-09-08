package assignment3;

import java.util.Scanner;

public class CICalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    private double futureValue;
    private double totalInterest;

     
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial investment amount (₹): ");
        principal = sc.nextDouble();
        System.out.println("Enter the annual interest rate (%): ");
        annualInterestRate = sc.nextDouble();
        System.out.println("Enter the number of times the interest is compounded per year: ");
        numberOfCompounds = sc.nextInt();
        System.out.println("Enter the investment duration (years): ");
        years = sc.nextInt();
    }

    
    public void calculateFutureValue() {
        futureValue = principal * Math.pow((1 + annualInterestRate / 100 / numberOfCompounds), numberOfCompounds * years);
        totalInterest = futureValue - principal;
    }

  
    public void printRecord() {
        System.out.printf("Future value of the investment: ₹%.2f%n", futureValue);
        System.out.printf("Total interest earned: ₹%.2f%n", totalInterest);
    }

    public static void main(String[] args) {
        CICalculator calculator = new CICalculator();
        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.printRecord();
    }
}
