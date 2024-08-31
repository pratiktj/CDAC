import java.util.Scanner;

 public class PositiveNumber 
   {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int iNum = sc.nextInt();

        if (iNum > 0) 
        {
            System.out.println("The number is positive.");
        } 
        else 
        {
            System.out.println("Number is not positive.");
        }
    }
}
