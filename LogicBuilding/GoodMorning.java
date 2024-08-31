import java.util.Scanner;
import java.util.InputMismatchException;

public class GoodMorning
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        try
        {
            float fNo = sobj.nextFloat();
            
            if (fNo >= 5 && fNo <= 12)
            {
                System.out.println("good morning");
            }
        }
        catch (InputMismatchException obj)
        {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}
