package QuestionFourPointFour;
import java.util.Scanner;
public class DiscountCalculatorUtil {
   
	
	    private DiscountCalculator calculator;

	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the original price (₹): ");
	        double originalPrice = scanner.nextDouble();

	        System.out.print("Enter the discount rate (%): ");
	        double discountRate = scanner.nextDouble();

	        calculator = new DiscountCalculator(originalPrice, discountRate);
	    }

	    public void printRecord() {
	        if (calculator != null) {
	            double discountAmount = calculator.calculateDiscountAmount();
	            double finalPrice = calculator.calculateFinalPrice();

	            System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
	            System.out.printf("Final Price: ₹%.2f%n", finalPrice);
	        } else {
	            System.out.println("No discount record found. Please accept the record first.");
	        }
	    }

	    public void menuList() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Accept Discount Record");
	            System.out.println("2. Print Discount Record");
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

