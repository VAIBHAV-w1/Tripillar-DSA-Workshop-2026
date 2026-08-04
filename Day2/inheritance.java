package Day2;

interface Name {
    void name();
}
interface Character {
    void character();
}

public class inheritance implements Name,Character {
    public void name()
    {
        System.out.println("Gangadhar");
    }
    public void character()
    {
        System.out.println("Shaktiman");
    }
    public static void main(String[] args) {
        inheritance in=new inheritance();
        in.name();
        in.character();
    }
}
