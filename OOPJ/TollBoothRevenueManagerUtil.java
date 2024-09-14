package QuestionFourPointFive;
import java.util.Scanner;
public class TollBoothRevenueManagerUtil {
   
	private TollBoothRevenueManager manager;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for cars (₹): ");
        double carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for trucks (₹): ");
        double truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for motorcycles (₹): ");
        double motorcycleRate = scanner.nextDouble();

        manager = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);

        System.out.print("Enter the number of cars: ");
        int carCount = scanner.nextInt();
        manager.setCarCount(carCount);

        System.out.print("Enter the number of trucks: ");
        int truckCount = scanner.nextInt();
        manager.setTruckCount(truckCount);

        System.out.print("Enter the number of motorcycles: ");
        int motorcycleCount = scanner.nextInt();
        manager.setMotorcycleCount(motorcycleCount);
    }

    public void printRecord() {
        if (manager != null) {
            double totalRevenue = manager.calculateTotalRevenue();
            int totalVehicles = manager.calculateTotalVehicles();

            System.out.printf("Total number of vehicles: %d%n", totalVehicles);
            System.out.printf("Total revenue collected: ₹%.2f%n", totalRevenue);
        } else {
            System.out.println("No toll record found. Please accept the record first.");
        }
    }

    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Accept Toll Record");
            System.out.println("2. Print Toll Record");
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

