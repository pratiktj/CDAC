//assignment 5
class Vehicle
{
   public  void startEngine()
   {

   }
    

    public void stopEngine()
    {

    }
    
}

class Car extends Vehicle
{
    public void startEngine()
    {
        System.out.println("car's ignition is on");
    }

    public void stopEngine()
    {
        System.out.println("car's ignition is off");
    }

}

class Motorcycle extends Vehicle
{
   public void startEngine()
   {
    System.out.println("Motorcycle's key is turned on");
   }

   public void stopEngine()
   {
    System.out.println("Motorcycle's key is turned off");
   }
}

class question5
{
    public static void main(String []args)
    {
         Car cobj=new Car();
         Motorcycle mobj=new Motorcycle();
         cobj.startEngine();
         cobj.stopEngine();

         mobj.startEngine();
         mobj.stopEngine();
    }
}