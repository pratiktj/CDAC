package assignment6;
import java.util.Scanner;
public class question5 {
  
	public static void acceptRecord(int[] array, String arrayName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " integers for " + arrayName + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
       
    }
    
    
    public static int[] findIntersection(int[] array1, int[] array2) {
        int[] temp = new int[array1.length];
        int k = 0;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    boolean isDuplicate = false;
                    for (int l = 0; l < k; l++) {
                        if (temp[l] == array1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[k++] = array1[i];
                    }
                }
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
    
    
    public static void printRecord(int[] array, String arrayName) {
        System.out.println(arrayName + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
    
    public static void main(String[] args) {
       
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        
        
        acceptRecord(array1, "Array 1");
        acceptRecord(array2, "Array 2");
        
        
        System.out.println("\nOriginal arrays:");
        printRecord(array1, "Array 1");
        printRecord(array2, "Array 2");
        
        
        int[] intersection = findIntersection(array1, array2);
        
        
        System.out.println("\nIntersection of the two arrays:");
        printRecord(intersection, "Intersection Array");
    }
}
