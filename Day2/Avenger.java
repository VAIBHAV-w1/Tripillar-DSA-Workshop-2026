package Day2;

public class Avenger {
    String name;
    String power;
    Avenger()
    {
        System.out.println("Avenger Assemble");
    }
    Avenger(String name)
    {
        this();
        this.name=name;
    }
    void show()
    {
        System.out.println("Avengers :"+name);
    }
    public static void main(String[] args) {
        Avenger A=new Avenger("Hulk");
        A.show();
    }

}
