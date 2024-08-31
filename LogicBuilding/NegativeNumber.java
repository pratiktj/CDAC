import java.util.Scanner;

 public class NegativeNumber 
   {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int iNum = sc.nextInt();

        if (iNum < 0) 
        {
            System.out.println("The number is Negative.");
        } 
        else 
        {
            System.out.println("Number is not Negative.");
        }
    }
}
