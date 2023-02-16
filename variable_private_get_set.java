class commonDetails
{
    private int age;
    private String name,gender,id;

    public commonDetails(String name,String id,int age,String gender) 
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }
    
}

//Class for Doctor
class doctorDetails extends commonDetails
{
    private int salary;
    private String specialist,chamber;

    public doctorDetails(String name, String id, int age, String gender, int salary, String specialist, String chamber)
    {
        super(name,id,age,gender);
        this.salary = salary;
        this.specialist = specialist;
        this.chamber = chamber;
    }

    public int getSalary() 
    {
        return salary;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }

    public String getSpecialist()
    {
        return specialist;
    }

    public void setSpecialist(String specialist)
    {
        this.specialist = specialist;
    }

    public String getChamber() 
    {
        return chamber;
    }

    public void setChamber(String chamber)
    {
        this.chamber = chamber;
    }
    
}

public class variable_private_get_set
{
    public static void main(String[] args)  
    {

        doctorDetails d = new doctorDetails("abc", "123", 20, "Male", 0, "xyz", "efg");

        System.out.println(d.getName());
    }
}
