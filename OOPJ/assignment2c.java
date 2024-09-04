import java.util.Scanner;
class assignment2c
{
public static void main(String []args)
{   Scanner sobj=new Scanner(System.in);
    System.out.println("Lets check if you can vote or not\n");
    System.out.println("Type your age\n");
    int iVote=0;
    iVote=sobj.nextInt();

    if(iVote<18)
    {
      System.out.println("Not elligible");
    }
    else
    {
        System.out.println("Yes you are");
    }
    
   

}

}

