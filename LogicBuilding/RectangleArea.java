import java.util.Scanner;

public class RectangleArea 
{
    public static void main(String[] args)
     {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("enter the length of Rectangle");
        float fLength=sobj.nextFloat();
        
         System.out.println("enter the width of Rectangle");
        float fWidth=sobj.nextFloat();

        float fArea = fLength * fWidth;

        System.out.println("Area of the rectangle is" + fArea);
    }
}
