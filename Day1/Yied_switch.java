package Day1;

import java.util.Scanner;

public class Yied_switch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        String color=
                switch(ch)
                {
                    case 'V'->{yield "Violet";}
                    case 'I'->{yield "Indigo";}
                    default ->{yield "Invalid Input";}
                };
        System.out.println(color);
    }
}