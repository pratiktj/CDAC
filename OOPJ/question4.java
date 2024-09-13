//assignment no 5
class student
{
    private String sName;
    private int iAge;
    private float fPercentage;
    private String sCity;

    public student(String sName,int iAge,float fPercentage,String sCity )
    {
        this.sName=sName;
        this.iAge=iAge;
        this.fPercentage=fPercentage;
        this.sCity=sCity;
    }

    public String getName() {
        return sName;
    }

    public int getAge() {
        return iAge;
    }

    public float getPercentage() {
        return fPercentage;
    }

    
    public void setName(String name) {
        this.sName = sName;
    }

    public void setAge(int age) {
        this.iAge = iAge;
    }

    public void setPercentage(float per) {
        this.fPercentage = fPercentage;
    }

    public String getDetails() {
        return "Name: " + sName + ", Age: " + iAge + ", Percentage: " + fPercentage;
    }

}



public class question4
{
    public static void main(String []args)
    {
        student sobj=new student("Pratik Jagtap",27,81.2f,"Nashik");
        System.out.println(sobj.getDetails());

    }
}