package assignment;
import java.util.Scanner;
public class CompoundInterestCalculatorUtil {
  
	private CompoundInterestCalculator calculator;

   
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the investment duration (years): ");
        int years = scanner.nextInt();

        calculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
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

