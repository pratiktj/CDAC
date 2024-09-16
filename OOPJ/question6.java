package assignment6;
import java.util.Scanner;

public class question6 {
  
	public static void acceptRecord(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }
    
    
    public static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : array) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        
        
        int[] numbers = new int[n - 1];
        
       
        acceptRecord(numbers);
        
        
        int missingNumber = findMissingNumber(numbers, n);
        System.out.println("The missing number is: " + missingNumber);
        
        scanner.close();
    }
}
