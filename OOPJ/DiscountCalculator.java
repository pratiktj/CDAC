package assignment3;

import java.util.Scanner;

public class DiscountCalculator {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price (₹): ");
        originalPrice = sc.nextDouble();
        System.out.println("Enter the discount percentage (%): ");
        discountRate = sc.nextDouble();
    }

    
    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    
    public void printRecord() {
        System.out.printf("Discount amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final price: ₹%.2f%n", finalPrice);
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}
