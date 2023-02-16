class common_details
{
    String name, NID, phone;
    int age;
    public void describe()
    {
        System.out.println("I'm a common people.");
    }
}
class doctor extends common_details
{
    String degree, college;
    int salary;
    public void describe()
    {
        System.out.println("I'm a Doctor");
    }
    
}
class engineer extends common_details
{
    String desig;
    int salary;
    public void describe()
    {
        System.out.println("I'm a Engineer");
    }
    
}


public class method_overriding {

    public static void main(String[] args) 
    {
        doctor d = new doctor();
        d.describe();

        engineer e = new engineer();
        e.describe();
    }
    
}
