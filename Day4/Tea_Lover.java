package Day4;
class TeaLoverException extends Exception
{
    TeaLoverException(String message){
        super(message);
    }
}
public class Tea_Lover {
    static void orderTea(String teaType)throws TeaLoverException
    {
        if(!teaType.equalsIgnoreCase("ginger")){
            throw new TeaLoverException("Blood Group Tea +ve");
        }
        System.out.println("Enjoy your Tea");
    }
    public static void main(String[] args) {
        try{
            orderTea("Green");
        } catch (TeaLoverException e) {
            System.out.println("Exception Caught :"+ e.getMessage());
        }
        finally {
            System.out.println("Now Find A Better Filter Coffee");
        }
    }
}
