package Day2;

public class Block_Demo {
    int x;//Instance Variable no usage
    //IIB-> Instance Initialization Block
    {
        x=10;
        System.out.println("IIB :"+x);
    }
    //Static Block
    static
    {
        System.out.println("Static Block");
    }
    //if there is a static block present in the code with iib block then first static block will run rather than the sequence of execution
    Block_Demo(int x)
    {
        this.x=x;
        System.out.println("Constructor :"+x);
    }
    public static void main(String[] args) {
        Block_Demo b=new Block_Demo(20);
    }
}
