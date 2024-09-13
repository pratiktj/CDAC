//assignment No 5
  class Animal {
    
    public String name;


    public Animal(String name) {
        this.name = name;
    }

    
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


 class Dog extends Animal {
   
    public Dog(String name) {
        super(name); 
    }

 
    public void bark() {
        System.out.println(name+ " is barking");
    }
}


public  class question3 {
    public static void main(String[] args) {
       
        Animal aobj = new Animal("tiger"); //base class object- parameterised const.gets called
        aobj.eat();   // base class obj calls method eat()
        aobj.sleep(); // base class obj calls method sleep()

        
        Dog dobj = new Dog("ollie"); // subclass obj created-parameterised cons.gets called
        dobj.eat();  // subclass obj calls eat method
        dobj.sleep(); // subclas obj calls sleeps methods
        dobj.bark();  // subclss obj calls bark methods
    }
}
