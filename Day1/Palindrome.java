package Day1;

public class Palindrome {
    public static void main(String[] args) {
        int og = 123;
        int rev = 0;
        while (og != 0) {
            int rem = og % 10;
            rev = rev * 10 + rem;
            og = og / 10;
        }
        System.out.println(rev);
        if (og==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

