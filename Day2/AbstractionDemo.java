package Day2;
abstract class Omnitrix{
    String owner;
    Omnitrix(String owner){
        this.owner=owner;
        System.out.println("Omnitrix :"+owner);
    }
    abstract void transform();//abstract method
    void activate(){
        System.out.println("Omnitrix Activated");
    }
}
class Ben10 extends Omnitrix{
    Ben10(String owner){
        super(owner);
    }
    @Override
    void transform(){
        System.out.println(owner+"Transform into four Arms");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Omnitrix ben=new Ben10("Ben 10");
    }
}