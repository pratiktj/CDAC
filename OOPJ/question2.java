package assignment6;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        
      
        System.out.println("Default values of the array:");
        printRecord(numbers);
        
        acceptRecord(numbers);
        
    
        System.out.println("\nUpdated values of the array:");
        printRecord(numbers);
    }
    
    
    public static void acceptRecord(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }
    
    
    public static void printRecord(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
}
  

