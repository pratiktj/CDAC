package QuestionFourPointTwo;
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
        if (calculator != null) {
            double futureValue = calculator.calculateFutureValue();
            double totalInterest = calculator.calculateTotalInterest();

            System.out.printf("Future Value: ₹%.2f%n", futureValue);
            System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
        } else {
            System.out.println("No investment record found. Please accept the record first.");
        }
    }

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Accept Investment Record");
            System.out.println("2. Print Investment Record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    break;
                case 2:
                    printRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    

