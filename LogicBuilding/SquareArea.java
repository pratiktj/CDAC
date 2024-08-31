import java.util.Scanner;

public class SquareArea 
{
    public static void main(String[] args)
     {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the side of square");
        float fSide=sobj.nextFloat();
        

        float fArea = fSide * fSide;

        System.out.println("Area of the square with side length " + fSide + " units: " + fArea);
    }
}
