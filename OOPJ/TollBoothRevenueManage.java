package assignment3;

import java.util.Scanner;

public class TollBoothRevenueManage {
    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;
    private double totalRevenue;

  
    public void setTollRates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter toll rate for Car (₹): ");
        carRate = sc.nextDouble();
        System.out.println("Enter toll rate for Truck (₹): ");
        truckRate = sc.nextDouble();
        System.out.println("Enter toll rate for Motorcycle (₹): ");
        motorcycleRate = sc.nextDouble();
    }

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Cars: ");
        carCount = sc.nextInt();
        System.out.println("Enter number of Trucks: ");
        truckCount = sc.nextInt();
        System.out.println("Enter number of Motorcycles: ");
        motorcycleCount = sc.nextInt();
    }

    
    public void calculateRevenue() {
        totalRevenue = (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

   
    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        System.out.printf("Total number of vehicles: %d%n", totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f%n", totalRevenue);
    }

    public static void main(String[] args) {
        TollBoothRevenueManage manager = new TollBoothRevenueManage();
        manager.setTollRates();
        manager.acceptRecord();
        manager.calculateRevenue();
        manager.printRecord();
    }
}
