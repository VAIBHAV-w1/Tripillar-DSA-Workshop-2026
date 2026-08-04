package Day1;

public class Implicit_Explicit {
    static void main(String[] args) {
        int a=10;
        System.out.println(a);
        double d=a;
        System.out.println(d);
        int b=(int)d;
        System.out.println(b);
        char ch='A';
        int i=ch;
        System.out.println(ch);
        System.out.println(i);
        int num=99;
        char exp=(char)num;
        System.out.println(num);
        System.out.println(exp);
    }
}
