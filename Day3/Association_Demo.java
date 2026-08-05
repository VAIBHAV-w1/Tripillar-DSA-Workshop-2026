package Day3;
class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}
class student{
    String name;
    student(String name)
    {
        this.name=name;
    }
}
class Association_Demo {
    public static void main(String[] args) {
        Teacher t=new Teacher("Nirmal");
        student s=new student("Nikhil");
        System.out.println(s.name+" is taught by "+t.name);
    }
}