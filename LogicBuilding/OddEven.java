import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int iNum = sc.nextInt();

        if (iNum % 2 == 0) 
        {
            System.out.println(iNum + " is even.");
        } else 
        {
            System.out.println(iNum + " is odd.");
        }
    }
}
