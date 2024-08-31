import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        // Input the three numbers
        System.out.print("Enter the first number: ");
        int iNum1 = sobj.nextInt();
        
        System.out.print("Enter the second number: ");
        int iNum2 = sobj.nextInt();
        
        System.out.print("Enter the third number: ");
        int iNum3 = sobj.nextInt();

        
        int iLargest=0;

        // Compare the three numbers
        if (iNum1 >= iNum2 && iNum1 >= iNum3)
        {
            iLargest = iNum1;
        }
        else if (iNum2 >= iNum1 && iNum2 >= iNum3)
        {
            iLargest = iNum2;
        }
        else
        {
            iLargest = iNum3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + iLargest);
    }
}
