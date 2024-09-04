import java.util.Scanner;
class assignment2b
{
public static void main(String []args)
{   Scanner sobj=new Scanner(System.in);
    System.out.println("Unit of height and weight are meters and kgs\n");

    float fHeight=0.0f;
    System.out.println("Enter the height");
    
    fHeight=sobj.nextFloat();

    float fWeight=0.0f;
     System.out.println("Enter the weight");
    fWeight=sobj.nextFloat();
    double dBMI=0.0d;


    dBMI=fWeight/(fHeight)*(fHeight);
    
    if(dBMI<18.5)
    {
        System.out.println("Underweight");
    }
    else if((dBMI>=18.5)&&(dBMI<=24.9))
    {
        System.out.println("Normal weight");
    }
    else if((dBMI>=25)&&(dBMI<=29.9))
    {
        System.out.println("Overweight");
    }
    else
    {
        System.out.println("Obesity");
    }

}

}

