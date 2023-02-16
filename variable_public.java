class commonDetails
{
    public int age;
    public String name,gender,id;

    public commonDetails(String name,String id,int age,String gender) 
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

}

//Class for Doctor
class doctorDetails extends commonDetails
{
    public int salary;
    public String specialist,chamber;

    public doctorDetails(String name, String id, int age, String gender, int salary, String specialist, String chamber)
    {
        super(name,id,age,gender);
        this.salary = salary;
        this.specialist = specialist;
        this.chamber = chamber;
    }

    
}

public class variable_public
{
    public static void main(String[] args)  
    {

        doctorDetails d = new doctorDetails("abc", "123", 20, "Male", 0, "xyz", "efg");

        System.out.println(d.name+d.age);
    }
}
