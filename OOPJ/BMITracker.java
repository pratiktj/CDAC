package assignment3;

import java.util.Scanner;

public class BMITracker {
	 public double dHeight;
	 public double dWeight;
	 public double dBMI;
	 public String classification;
	 
	 public void acceptRecord()
	 {   
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Type weight in kgs");
		 dWeight=sc.nextDouble();
		 System.out.println("Type height in meters");
		 dHeight=sc.nextDouble();
		 
      }
	 
	 public void calculateBMI()
	 {
		 dBMI=dWeight/(dHeight * dHeight);
		 
	 }
	 
	 public void classifyBMI()
	 {
		 if(dBMI<18.5)
		 {
			 classification="Underweight";
			 
		 }
		 else if(dBMI>=18.5&&dBMI<24.9)
		 {
			 classification="Normal Weight";
		 }
		 else if(dBMI<=25&&dBMI<29.9)
		 {
			 classification="Overweight";
		 }
		 else
		 {
			 classification="Obese";
		 }
	 }
	 
	 public void printRecord()
	 {
		 System.out.printf("BMI is: %.2f, classification is: %s%n", dBMI, classification);
	 }
	
	
	public static void main(String []args)
	{  
		BMITracker bobj=new BMITracker();
		bobj.acceptRecord();
		bobj.calculateBMI();
		bobj.classifyBMI();
		bobj.printRecord();
	}

}
