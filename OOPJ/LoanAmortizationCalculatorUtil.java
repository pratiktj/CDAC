package QuestionFourPointOne;
import java.util.Scanner;
public class LoanAmortizationCalculatorUtil {
    
	private LoanAmortizationCalculator calculator;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (years): ");
        int loanTerm = scanner.nextInt();

        calculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    public void printRecord() {
        if (calculator != null) {
            double monthlyPayment = calculator.calculateMonthlyPayment();
            double totalPayment = calculator.calculateTotalPayment();

            System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
            System.out.printf("Total Payment over the life of the loan: ₹%.2f%n", totalPayment);
        } else {
            System.out.println("No loan record found. Please accept the record first.");
        }
    }

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Accept Loan Record");
            System.out.println("2. Print Loan Record");
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

