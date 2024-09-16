package assignment6;
import java.util.Arrays;
import java.util.Scanner;
public class question4 {
   
	   public static void acceptRecord(int[] array) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter " + array.length + " integers:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();
	    }
	    
	    
	    public static int[] removeDuplicates(int[] array) {
	        Arrays.sort(array); // Sort the array to bring duplicates together
	        int[] temp = new int[array.length];
	        int j = 0;
	        
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                temp[j++] = array[i];
	            }
	        }
	        temp[j++] = array[array.length - 1];
	        
	        // Copy the unique elements to the final array
	        int[] result = new int[j];
	        System.arraycopy(temp, 0, result, 0, j);
	        
	        return result;
	    }
	    
	    
	    public static void printRecord(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Element at index " + i + ": " + array[i]);
	        }
	    }
	    
	    public static void main(String[] args) {
	        
	        int[] numbers = new int[5];
	        
	        
	        acceptRecord(numbers);
	        
	        
	        System.out.println("\nOriginal array:");
	        printRecord(numbers);
	        
	        
	        int[] uniqueNumbers = removeDuplicates(numbers);
	        
	        
	        System.out.println("\nArray after removing duplicates:");
	        printRecord(uniqueNumbers);
	    }
}
