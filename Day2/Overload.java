package Day2;

public class Overload {
    int add(int a,int b)
    {
        System.out.println("Add Two Integeres");
        return a+b;
    }
    double add(double a, double b)
    {
        System.out.println("Add Two Double Number");
        return a+b;
    }
    String add(String a,String b)
    {
        System.out.println("Two Strings");
        return a+b;
    }

    public static void main(String[] args) {
        Overload ol=new Overload();
        System.out.println(ol.add(4,5));
        System.out.println(ol.add(1500.00d,1500.00d));
        System.out.println(ol.add("Vaibhav","Wandkar"));
    }
}
