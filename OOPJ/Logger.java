package Assignment5;
//question2
public class Logger {
      private static Logger instance;
      
      public static Logger getInstance()
		{
			return instance;
		}
      
       public void log(String message)
       {
    	   System.out.println("log:"+message);
       }
       
       public String getLog()
       {
    	   return log.toString();
       }

      
      
      
	public static void main(String[] args) {
	 
		
	}

}
