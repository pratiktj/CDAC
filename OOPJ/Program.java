package assignment;
import java.util.Scanner;
public class Program {
  
	public static void main(String[] args) {
        CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    util.acceptRecord();
                    break;
                case 2:
                    util.printRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}

