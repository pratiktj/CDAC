package assignment6;
import java.util.Scanner;

public class question3 {
	public static void acceptRecord(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }
    
 
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        
       
        acceptRecord(numbers);
        
        
        int max = findMax(numbers);
        int min = findMin(numbers);
        
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
