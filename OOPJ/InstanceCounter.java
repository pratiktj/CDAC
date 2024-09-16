package Assignment5;

public class InstanceCounter {

	
		public static int iCount=0;
	     
		public InstanceCounter()
		{
			 iCount++;
		}
		
		public void DisplayCounter()
		{
			System.out.println("Number of instance are:"+iCount);
		}

		public static void main(String[] args) {
			
			
			InstanceCounter iobj1=new InstanceCounter();
			InstanceCounter iobj2=new InstanceCounter();
			InstanceCounter iobj3=new InstanceCounter();
			
			iobj1.DisplayCounter();
			
			
		}

	

}
