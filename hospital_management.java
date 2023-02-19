import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//For some common properties like age,name,gender,id
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

//Class for Employee
class employeeDetails extends commonDetails
{
    private int salary;
    private String position;

    public employeeDetails(String name, String id, int age, String gender, int salary, String position) 
    {
        super(name, id, age, gender);
        this.salary = salary;
        this.position=position;
    }

    public int getSalary() 
    {
        return salary;
    }

    public void setSalary(int salary) 
    {
        this.salary = salary;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }
    
}

//Class for Patient
class patientDetails extends commonDetails
{
    private int total,paid,bednum;
    private String bloodgroup,doctor,disease,room;

    public patientDetails(String name, String id, int age, String gender, int total, int paid, String bloodgroup, String doctor, String disease, String room) 
    {
        super(name, id, age, gender);
        this.total = total;
        this.paid = paid;
        this.bloodgroup = bloodgroup;
        this.doctor = doctor;
        this.disease = disease;
        this.room = room;
        
    }

    public int getTotal() 
    {
        return total;
    }

    public void setTotal(int total) 
    {
        this.total = total;
    }

    public int getPaid()
    {
        return paid;
    }

    public void setPaid(int paid) 
    {
        this.paid = paid;
    }

    public String getBloodgroup() 
    {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup)
    {
        this.bloodgroup = bloodgroup;
    }

    public String getDoctor()
    {
        return doctor;
    }

    public void setDoctor(String doctor)
    {
        this.doctor = doctor;
    }

    public String getDisease()
    {
        return disease;
    }

    public void setDisease(String disease)
    {
        this.disease = disease;
    }

    public String getRoom()
    {
        return room;
    }

    public void setRoom(String room) 
    {
        this.room = room;
    }
      
}

public class hospital_management 
{

    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);  
                
        ArrayList <doctorDetails> doctors = new ArrayList <>();
        ArrayList <employeeDetails> employees = new ArrayList <>();
        ArrayList <patientDetails> patients = new ArrayList <>();
        
        
        Start:                 
        while(true)
        {
            int age, salary, total, paid ;
            String name = null, id, gender, specialist, chamber, position, bloodgroup , doctor , disease , room ;       

            System.out.println("........................Hospital Management........................\n\n");
            System.out.println("1. Doctor's Details.");
            System.out.println("2. Employee's Details.");
            System.out.println("3. Patient's Details.");
            System.out.println("4. Quit");
            System.out.printf("\nEnter an Option :");
            
            int mainMenu = input.nextInt(); //To store Menu number
            System.out.printf("\n\n");
           
            
            
            switch(mainMenu)
            {
                case 1:
                {
                    
                    while(true)
                    {
                        
                        System.out.println("\n\n........................Doctor's Detail........................\n\n");
                        System.out.println("1. Display All Doctor's Record.");
                        System.out.println("2. Add New Doctor.(Autometically From a File)");
                        System.out.println("3. Add New Doctor.(Manually)");
                        System.out.println("4. Edit Exist Doctor's Record / Delete Doctor's Record.");
                        System.out.println("5. Print Records in File");
                        System.out.println("6. Back");
                        System.out.printf("\n\nEnter an Option :");
                        
                        int drMenu = input.nextInt();
                        System.out.printf("\n\n");
                        
                        switch(drMenu)
                        {
                            case 1: //To print
                            {
                                
                                for(int i=0; i<doctors.size(); i++)
                                {
                                    System.out.println("\n");
                                    System.out.println("Record : "+(i+1));
                                    System.out.println("Name : "+doctors.get(i).getName());
                                    System.out.println("ID : "+doctors.get(i).getId());
                                    System.out.println("Age : "+doctors.get(i).getAge());
                                    System.out.println("Gender : "+doctors.get(i).getGender());
                                    System.out.println("Salary : "+doctors.get(i).getSalary());
                                    System.out.println("Specialist : "+doctors.get(i).getSpecialist());
                                    System.out.println("Chamber : "+doctors.get(i).getChamber());
                                    System.out.println("");
                                }
                                
                                continue;
                            }
                            
                            case 2: //To auto add
                            {
                                File file = new File("DoctorInfIn.txt");
                                Scanner sc = new Scanner(file);
                                    while(sc.hasNext())
                                    {
                                    
                                        name = sc.next();
                                        id = sc.next();
                                        age = Integer.parseInt(sc.next());
                                        gender = sc.next();
                                        salary = Integer.parseInt(sc.next());
                                        specialist = sc.next();
                                        chamber = sc.next();
                                        sc.nextLine();
                                       
                                        doctors.add(new doctorDetails(name, id, age, gender, salary, specialist, chamber));
 
                                    }
                                    continue;

                            }
                            
                            case 3:  //To add
                            {
                                System.out.println("");
                                System.out.printf("Enter New Doctor's Name :");
                                input.nextLine();   //To skip some problems of scanning String
                                name = input.nextLine();
                                System.out.printf("Enter New Doctor's ID :");
                                id = input.nextLine();
                                System.out.printf("Enter New Doctor's Age :");
                                age = input.nextInt();
                                System.out.printf("Enter New Doctor's Gender :");
                                input.nextLine();
                                gender = input.nextLine();
                                System.out.printf("Enter New Doctor's Salary :");
                                salary = input.nextInt();
                                System.out.printf("Enter New Doctor's Speciality :");
                                input.nextLine();
                                specialist = input.nextLine();
                                System.out.printf("Enter New Doctor's Chamber :");
                                chamber = input.nextLine();

                                doctors.add(new doctorDetails(name, id, age, gender, salary, specialist, chamber));
                                continue;
                            }
                            
                            
                            
                            case 4: //To edit
                            {
                                
                                System.out.println("");
                                System.out.println("Enter Doctor's ID to Edit : ");
                                input.nextLine();
                                id = input.nextLine();
                                
                                
                                for(int i=0; i<doctors.size(); i++)
                                {
                                   
                                    if(doctors.get(i).getId().equals(id))   //to compare using equals(id)
                                    {
                                        System.out.println("Match Found\n");
                                        System.out.println("1. Edit Name.");
                                        System.out.println("2. Edit ID.");
                                        System.out.println("3. Edit Age.");
                                        System.out.println("4. Edit Gender.");
                                        System.out.println("5. Edit Salary.");
                                        System.out.println("6. Edit Speciality.");
                                        System.out.println("7. Edit Chamber.");
                                        System.out.println("8. Delete Record.");
                                
                                        int editMenu = input.nextInt();
                                        
                                        switch(editMenu)
                                        {
                                            case 1:
                                            {
                                                input.nextLine();
                                                name = input.nextLine();
                                                doctors.get(i).setName(name);
                                                break;
                                            }
                                            case 2:
                                            {
                                                input.nextLine();
                                                id = input.nextLine();
                                                doctors.get(i).setId(id);
                                                break;
                                            }
                                            case 3:
                                            {
                                                age = input.nextInt();
                                                doctors.get(i).setAge(age);
                                                break;
                                            }
                                            case 4:
                                            {
                                                input.nextLine();
                                                gender = input.nextLine();
                                                doctors.get(i).setGender(gender);
                                                break;
                                            }
                                            case 5:
                                            {
                                                salary = input.nextInt();
                                                doctors.get(i).setSalary(salary);
                                                break;
                                            }
                                            case 6:
                                            {
                                                input.nextLine();
                                                specialist = input.nextLine();
                                                doctors.get(i).setSpecialist(specialist);
                                                break;
                                            }
                                            case 7:
                                            {
                                                input.nextLine();
                                                chamber = input.nextLine();
                                                doctors.get(i).setChamber(chamber);
                                                break;
                                            }
                                            case 8:
                                            {
                                                doctors.remove(i); //To remove data
                                                break;
                                            }
                                            default :
                                            {
                                                break;
                                            }
                                        
                                        }
                                    }  
                                }
                                
                                continue;
                            }
                            
                            case 5: //To Print
                            {
                                File file = new File("DoctorInfOut.txt");
                                file.createNewFile();
                                FileWriter fileWriter = new FileWriter(file, true);
                                BufferedWriter writer = new BufferedWriter(fileWriter);
                                
                                for(int i=0; i<doctors.size(); i++)
                                {
                                    writer.write("Name : "+doctors.get(i).getName());
                                    writer.write("\nID : "+doctors.get(i).getId());
                                    writer.write("\nAge : "+doctors.get(i).getAge());
                                    writer.write("\nGender : "+doctors.get(i).getGender());
                                    writer.write("\nSalary : "+doctors.get(i).getSalary());
                                    writer.write("\nSpecialist : "+doctors.get(i).getSpecialist());
                                    writer.write("\nChamber : "+doctors.get(i).getChamber());
                                    writer.write("\n\n");
                                }
                                writer.close();

                                continue;
                            }
                            
                            case 6:
                            {
                                break;
                            }
                            
                            
                            
                            
                            default :
                            {
                                continue;
                            }
                        
                        }
                        continue Start;
                    }
                    
                }
                
                
                case 2:
                {
                    
                    
                    while(true)
                    {
                        int empMenu;
                        
                        System.out.println("\n\n........................Employee's Detail........................\n\n");
                        System.out.println("1. Display All Employee's Record.");
                        System.out.println("2. Add New Doctor.(Autometically From a File)");
                        System.out.println("3. Add New Employee.(Manually)");
                        System.out.println("4. Edit Exist Employee's Record / Delete Employee's Record.");
                        System.out.println("5. Print Records in File.");
                        System.out.println("6. Back.");
                        System.out.printf("\n\nEnter an Option :");
                        
                        empMenu = input.nextInt();
                        System.out.printf("\n\n");
                        
                        switch(empMenu)
                        {
                            case 1:
                            {
                                for(int i=0; i<employees.size(); i++)
                                {
                                    System.out.println("\n");
                                    System.out.println("Record : "+(i+1));
                                    System.out.println("Name : "+employees.get(i).getName());
                                    System.out.println("ID : "+employees.get(i).getId());
                                    System.out.println("Age : "+employees.get(i).getAge());
                                    System.out.println("Gender : "+employees.get(i).getGender());
                                    System.out.println("Salary : "+employees.get(i).getSalary());
                                    System.out.println("Position : "+employees.get(i).getPosition());
                                    System.out.println("");
                                }
                                
                                continue;
                            }
                            
                            case 2: //To auto add
                            {
                                File file = new File("EmployeeInfIn.txt");
                                Scanner sc = new Scanner(file);
                                
                                    while(sc.hasNext())
                                    {
                                        
                                        name = sc.next();
                                        id = sc.next();
                                        age = Integer.parseInt(sc.next());
                                        gender = sc.next();
                                        salary = Integer.parseInt(sc.next());
                                        position = sc.next();
                                        sc.nextLine();
                                        employees.add(new employeeDetails(name, id, age, gender, salary, position));
 
                                    }
                                    continue;

                            }
                            
                            case 3:
                            {
                                System.out.printf("Enter New Employee's Name :");
                                input.nextLine();
                                name = input.nextLine();
                                System.out.printf("Enter New Employee's ID :");
                                id = input.nextLine();
                                System.out.printf("Enter New Employee's Age :");
                                age = input.nextInt();
                                System.out.printf("Enter New Employee's Gender :");
                                input.nextLine();
                                gender = input.nextLine();
                                System.out.printf("Enter New Employee's Salary :");
                                salary = input.nextInt();
                                System.out.printf("Enter New Employee's Position :");
                                input.nextLine();
                                position = input.nextLine();
                                
                                employees.add(new employeeDetails(name, id, age, gender, salary, position));

                                continue;
                            }
                            

                            case 4:
                            {
                                System.out.println("");
                                System.out.println("Enter Employee's ID to Edit : ");
                                input.nextLine();
                                id = input.nextLine();
                                
                                
                                for(int i=0; i<employees.size(); i++)
                                {
                                    
                                    if(employees.get(i).getId().equals(id))
                                    {
                                        System.out.println("Match Found\n");
                                        System.out.println("1. Edit Name.");
                                        System.out.println("2. Edit ID.");
                                        System.out.println("3. Edit Age.");
                                        System.out.println("4. Edit Gender.");
                                        System.out.println("5. Edit Salary.");
                                        System.out.println("6. Edit Position.");
                                        System.out.println("7. Delete Record.");
                                        
                                        int editMenu = input.nextInt();
                                        
                                        switch(editMenu)
                                        {
                                            case 1:
                                            {
                                                input.nextLine();
                                                name = input.nextLine();
                                                employees.get(i).setName(name);
                                                break;
                                            }
                                            case 2:
                                            {
                                                input.nextLine();
                                                id = input.nextLine();
                                                employees.get(i).setId(id);
                                                break;
                                            }
                                            case 3:
                                            {
                                                age = input.nextInt();
                                                employees.get(i).setAge(age);
                                                break;
                                            }
                                            case 4:
                                            {
                                                input.nextLine();
                                                gender = input.nextLine();
                                                employees.get(i).setGender(gender);
                                                break;
                                            }
                                            case 5:
                                            {
                                                salary = input.nextInt();
                                                employees.get(i).setSalary(salary);
                                                break;
                                            }
                                            case 6:
                                            {
                                                input.nextLine();
                                                position = input.nextLine();
                                                employees.get(i).setPosition(position);
                                                break;
                                            }
                                            case 7:
                                            {
                                                employees.remove(i);
                                                break;
                                            }
                                            default :
                                            {
                                                break;
                                            }
                                        
                                        }
                                    }
                                    
                                }
                                
                                continue;
                            }
                            
                            
                            case 5:
                            {
                                File file = new File("EmployeeInfOut.txt");
                                file.createNewFile();
                                FileWriter fileWriter = new FileWriter(file, true);
                                BufferedWriter writer = new BufferedWriter(fileWriter);
                                
                                for(int i=0; i<employees.size(); i++)
                                {
                                    writer.write("Name : "+employees.get(i).getName());
                                    writer.write("\nID : "+employees.get(i).getId());
                                    writer.write("\nAge : "+employees.get(i).getAge());
                                    writer.write("\nGender : "+employees.get(i).getGender());
                                    writer.write("\nSalary : "+employees.get(i).getSalary());
                                    writer.write("\nPosition : "+employees.get(i).getPosition());
                                    writer.write("\n\n");
                                }
                                writer.close();

                                continue;
                            }
                            
                            case 6:
                            {
                                break;
                            }
                            
                            default :
                            {
                                continue;
                            }
                        
                        }
                        continue Start;
                    }
                    
                }
                
                
                case 3:
                {
                   
                    
                    while(true)
                    {
                        int patMenu;
                        
                        System.out.println("\n\n........................Patient's Detail........................\n\n");
                        System.out.println("1. Display All Patient's Record.");
                        System.out.println("2. Add New Patient.(Autometically From a File)");
                        System.out.println("3. Add New Patient.(Manually)");
                        System.out.println("4. Edit Exist Patient's Record / Delete Patient's Record.");
                        System.out.println("5. Print Records in File.");
                        System.out.println("6. Back");
                        System.out.printf("\n\n Enter an Option :");
                        
                        patMenu = input.nextInt();
                        System.out.printf("\n\n");
                        
                        switch(patMenu)
                        {
                            case 1:
                            {
                                for(int i=0; i<patients.size(); i++)
                                {
                                    System.out.println("\n");
                                    System.out.println("Record : "+(i+1));
                                    System.out.println("Name : "+patients.get(i).getName());
                                    System.out.println("ID : "+patients.get(i).getId());
                                    System.out.println("Age : "+patients.get(i).getAge());
                                    System.out.println("Gender : "+patients.get(i).getGender());
                                    System.out.println("Blood Group : "+patients.get(i).getBloodgroup());
                                    System.out.println("Disease Name : "+patients.get(i).getDisease());
                                    System.out.println("Consulted Doctor's Name : "+patients.get(i).getDoctor());
                                    System.out.println("Room and Bed Number : "+patients.get(i).getRoom());
                                    System.out.println("Total Cost : "+patients.get(i).getTotal());
                                    System.out.println("Total Paid Ammount : "+patients.get(i).getPaid());
                                    System.out.println("Total Due Ammount : "+((patients.get(i).getTotal())-(patients.get(i).getPaid())));
                                    System.out.println("");
                                }
                                
                                continue;
                            }
                            
                            case 2: //To auto add
                            {
                                File file = new File("PatientInfIn.txt");
                                Scanner sc = new Scanner(file);
                                
                                    while(sc.hasNext())
                                    {
                                        
                                        name = sc.next();
                                        id = sc.next();
                                        age = Integer.parseInt(sc.next());
                                        gender = sc.next();
                                        sc.nextLine();
                                        bloodgroup = sc.next();
                                        
                                        disease = sc.next();
                                        doctor = sc.next();
                                        
                                        room = sc.next();
                                        
                                        total = Integer.parseInt(sc.next());
                                        paid = Integer.parseInt(sc.next());
                                        
                                        patients.add(new patientDetails(name, id, age, gender, total, paid, bloodgroup, doctor , disease, room));
                                        
                                    }
                                    continue;

                            }
                            
                            case 3:
                            {
                                System.out.printf("Enter New Patient's Name :");
                                input.nextLine();
                                name = input.nextLine();
                                System.out.printf("Enter New Patient's ID :");
                                id = input.nextLine();
                                System.out.printf("Enter New Patient's Age :");
                                age = input.nextInt();
                                System.out.printf("Enter New Patient's Gender :");
                                input.nextLine();
                                gender = input.nextLine();
                                System.out.printf("Enter New Patient's Blood Group :");
                                bloodgroup = input.nextLine();
                                System.out.printf("Enter New Patient's Disease Name :");
                                disease = input.nextLine();
                                System.out.printf("Enter New Patient's Consulted Doctor's Name :");
                                doctor = input.nextLine();
                                System.out.printf("Enter New Patient's Room - Bed Number :");
                                room = input.nextLine();
                                System.out.printf("Enter New Patient's Total Cost :");
                                total = input.nextInt();
                                System.out.printf("Enter New Patient's Total Paid Ammount :");
                                paid = input.nextInt();
                                
                                patients.add(new patientDetails(name, id, age, gender, total, paid, bloodgroup, doctor , disease, room));
                                continue;
                            }
                            
                            
                            
                            case 4:
                            {
                                System.out.println("");
                                System.out.println("Enter Patients's ID to Edit : ");
                                input.nextLine();
                                id = input.nextLine();
                                
                                for(int i=0; i<patients.size(); i++)
                                {
                                    
                                    if(patients.get(i).getId().equals(id))
                                    {
                                        System.out.println("Match Found\n");
                                        System.out.println("1.  Edit Name.");
                                        System.out.println("2.  Edit ID.");
                                        System.out.println("3.  Edit Age.");
                                        System.out.println("4.  Edit Gender.");
                                        System.out.println("5.  Edit Blood Group.");
                                        System.out.println("6.  Edit Disease Name.");
                                        System.out.println("7.  Edit Consulted Doctor's Name.");
                                        System.out.println("8.  Edit Room - Bed Number.");
                                        System.out.println("9.  Edit Total Cost.");
                                        System.out.println("10. Edit Paid Ammount.");
                                        System.out.println("11. Delete Record.");
                                        
                                        int editMenu = input.nextInt();
                                        
                                        switch(editMenu)
                                        {
                                            case 1:
                                            {
                                                input.nextLine();
                                                name = input.nextLine();
                                                patients.get(i).setName(name);
                                                break;
                                            }
                                            case 2:
                                            {
                                                input.nextLine();
                                                id = input.nextLine();
                                                patients.get(i).setId(id);
                                                break;
                                            }
                                            case 3:
                                            {
                                                age = input.nextInt();
                                                patients.get(i).setAge(age);
                                                break;
                                            }
                                            case 4:
                                            {
                                                input.nextLine();
                                                gender = input.nextLine();
                                                patients.get(i).setGender(gender);
                                                break;
                                            }
                                            case 5:
                                            {
                                                input.nextLine();
                                                bloodgroup = input.nextLine();
                                                patients.get(i).setBloodgroup(bloodgroup);
                                                break;
                                            }
                                            case 6:
                                            {
                                                input.nextLine();
                                                disease = input.nextLine();
                                                patients.get(i).setDisease(disease);
                                                break;
                                            }
                                            case 7:
                                            {
                                                input.nextLine();
                                                doctor = input.nextLine();
                                                patients.get(i).setDoctor(doctor);
                                                break;
                                            }
                                            case 8:
                                            {
                                                input.nextLine();
                                                room = input.nextLine();
                                                patients.get(i).setRoom(room);
                                                break;
                                            }
                                            case 9:
                                            {
                                                total = input.nextInt();
                                                patients.get(i).setTotal(total);
                                                break;
                                            }
                                            case 10:
                                            {
                                                paid = input.nextInt();
                                                patients.get(i).setPaid(paid);
                                                break;
                                            }
                                            case 11:
                                            {
                                                patients.remove(i);
                                                break;
                                            }
                                            default :
                                            {
                                                break;
                                            }
                                        
                                        }
                                    }
                                    
                                }
                                
                                continue;
                            }
                            
                            case 5:
                            {
                                File file = new File("PatientInfOut.txt");
                                file.createNewFile();
                                FileWriter fileWriter = new FileWriter(file, true);
                                BufferedWriter writer = new BufferedWriter(fileWriter);
                                
                                for(int i=0; i<patients.size(); i++)
                                {
                                    writer.write("Name : "+patients.get(i).getName());
                                    writer.write("\nID : "+patients.get(i).getId());
                                    writer.write("\nAge : "+patients.get(i).getAge());
                                    writer.write("\nGender : "+patients.get(i).getGender());
                                    writer.write("\nBlood Group : "+patients.get(i).getBloodgroup());
                                    writer.write("\nDisease Name : "+patients.get(i).getDisease());
                                    writer.write("\nConsulted Doctor's Name : "+patients.get(i).getDoctor());
                                    writer.write("\nRoom and Bed Number : "+patients.get(i).getRoom());
                                    writer.write("\nTotal Cost : "+patients.get(i).getTotal());
                                    writer.write("\nTotal Paid Ammount : "+patients.get(i).getPaid());
                                    writer.write("\nTotal Due Ammount : "+((patients.get(i).getTotal())-(patients.get(i).getPaid())));
                                    writer.write("\n\n");
                                }
                                writer.close();

                                continue;
                            }
                            
                            case 6:
                            {
                                break;
                            }
                            
                            default :
                            {
                                continue;
                            }
                        
                        }
                        continue Start;
                    }
                    
                }
                case 4:
                {
                    break Start;
                }
                
                default :
                {
                    break;
                }

            }

        }
         
    }  
}

