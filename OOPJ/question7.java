package assignment6;
import java.util.Scanner;

public class question7 {
  
	    private int[] numbers;
	    
	    
	    public question7(int size) {
	        numbers = new int[size];
	    }
	    
	    
	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter " + numbers.length + " integers:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            numbers[i] = scanner.nextInt();
	        }
	    }
	    
	    
	    public void printRecord() {
	        System.out.println("Array elements:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }
	    }
	    
	    public static void main(String[] args) {
	        
	        question7 arrayHandler = new question7(5);
	        
	       
	        arrayHandler.acceptRecord();
	        
	       
	        arrayHandler.printRecord();
	    }
}
