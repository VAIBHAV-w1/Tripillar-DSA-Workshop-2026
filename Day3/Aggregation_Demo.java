package Day3;
class Department{
    String deptName;
    Department(String deptName){
        this.deptName=deptName;
    }
}
class College{
    String collName;
    Department department;
    College(String collName,Department department) {
        this.collName = collName;
        this.department = department;
    }
    void display()
    {
        System.out.println(collName+"has department "+" "+department.deptName);
    }
}
public class Aggregation_Demo {
    public static void main(String[] args) {
        Department d=new Department("CSD");
        College c=new College("BIET",d);
        c.display();
    }
}
