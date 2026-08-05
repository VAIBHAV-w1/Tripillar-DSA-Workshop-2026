package Day2;
class Bahubali
{
    void fight()
    {
        System.out.println("Amrendra Bahubali");
    }
}
class MahendraBahubali extends Bahubali
{
    @Override
    void fight() {
        System.out.println("Mahendra Fight");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Bahubali b=new MahendraBahubali();
        b.fight();
    }
}
