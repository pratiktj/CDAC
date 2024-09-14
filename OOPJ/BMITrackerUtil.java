package QuestionFourPointThree;
import java.util.Scanner;
public class BMITrackerUtil {
	private BMITracker tracker;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        tracker = new BMITracker(weight, height);
    }

    public void printRecord() {
        if (tracker != null) {
            double bmi = tracker.calculateBMI();
            String classification = tracker.classifyBMI();

            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println("Classification: " + classification);
        } else {
            System.out.println("No BMI record found. Please accept the record first.");
        }
    }

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Accept BMI Record");
            System.out.println("2. Print BMI Record");
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

