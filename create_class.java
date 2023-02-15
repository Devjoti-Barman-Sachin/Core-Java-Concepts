class common_details
{
    String name, NID, phone;
    int age;
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
        System.out.println("I'm an Engineer");
    }
}

public class create_class {
    public static void main(String[] args) 
    {
        doctor d = new doctor();
        engineer e = new engineer();

        d.describe();
        e.describe();
    }
    
}
