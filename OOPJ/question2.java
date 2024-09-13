//assignment 5
class Vehicle
{ 
    private String sMake;
    private int iYear;

   public Vehicle(String sCompanyName,int iPeriod)
    {
       this.sMake=sCompanyName;
       this.iYear=iPeriod;

      
    }

    public void displayDetails()
    {
        System.out.println(this.sMake);
        System.out.println(this.iYear);
    }



}

class car extends Vehicle
{
    private String sModel;
    
    public car(String sCompanyName,int iPeriod,String sCarName)
    {  
        super(sCompanyName,iPeriod);
         this.sModel=sCarName;
    }

    public void displayDetails()
    {    super.displayDetails();
        System.out.println(this.sModel);
    }

}

class question2
{
    public static void main(String []args)
    {
        car cobj=new car("honda",2024,"Civic");
        cobj.displayDetails();
    }

    
}