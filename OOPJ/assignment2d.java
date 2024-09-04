import java.util.Scanner;
class assignment2d
{
public static void main(String []args)
{   
    Scanner sobj=new Scanner(System.in);
    int iMonth=0;

    System.out.println("Enter a month");
    iMonth=sobj.nextInt();
    
    switch(iMonth)
    {
        case 1:
       System.out.println("Winter");
       break;

       case 2:
       System.out.println("Winter");
       break;

       case 3:
       System.out.println("Spring");
       break;

        case 4:
       System.out.println("Spring");
       break;

        case 5:
       System.out.println("Spring");
       break;

        case 6:
       System.out.println("Summer");
       break;

        case 7:
       System.out.println("Summer");
       break;

       case 8:
       System.out.println("Summer");
       break;

       
       case 9:
       System.out.println("Autumn");
       break;
       
       
       case 10:
       System.out.println("Autumn");
       break;
       
       
       case 11:
       System.out.println("Autumn");
       break;
       
       case 12:
        System.out.println("Winter");
        break;
       
       default:
        System.out.println("Invalid input try again");
       break;

    }

}

}

