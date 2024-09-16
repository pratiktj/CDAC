package assignment6;
import java.util.Scanner;

public class question8 {
	    private int[] numbers;
	    
	    
	    public question8(int size) {
	        numbers = new int[size];
	    }
	    
	    
	    public int[] getNumbers() {
	        return numbers;
	    }
	    
	    
	    public void setNumbers(int[] numbers) {
	        this.numbers = numbers;
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
	        
	        question8 arrayHandler = new question8(5);
	        
	       
	        arrayHandler.acceptRecord();
	        
	        
	        arrayHandler.printRecord();
	        
	       
	        int[] newNumbers = {10, 20, 30, 40, 50};
	        arrayHandler.setNumbers(newNumbers);
	        
	        System.out.println("\nUpdated array using setter:");
	        arrayHandler.printRecord();
	        
	        int[] retrievedNumbers = arrayHandler.getNumbers();
	        System.out.println("\nRetrieved array using getter:");
	        for (int i = 0; i < retrievedNumbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + retrievedNumbers[i]);
	        
	        }
	    }
}
