class common_details
{
    String name, NID, phone;
    int age;
}
class doctor extends common_details
{
    String degree, college;
    int salary;
    public void describe(String degree)
    {
        System.out.println("I'm a "+degree+" Doctor");
    }
    public void describe(int age)
    {
        System.out.println("My age is "+age);
    }
}
class engineer extends common_details
{
    String desig;
    int salary;
    public void describe(String degree)
    {
        System.out.println("I'm a "+degree+" Engineer");
    }
    public void describe(int age)
    {
        System.out.println("My age is "+age);
    }
}


public class method_overloading {

    public static void main(String[] args) 
    {
        doctor d = new doctor();
        d.describe("MBBS");
        d.describe(30);

        engineer e = new engineer();
        e.describe("CS");
        e.describe(24);
    }
    
}
