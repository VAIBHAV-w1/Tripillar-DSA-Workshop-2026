package Day3;

class Student{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Invalid age");
        }
    }
    public int getAge()
    {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student su=new Student();
        su.setName("KL Rahul");
        su.setAge(31);
        System.out.println("Name: "+su.getName());
        System.out.println("Age: "+su.getAge());
        su.setName("Virat");
        System.out.println("Name: "+su.getName());
    }
}
