package Day1;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int sum = 0;

        // Count digits
        while (num != 0) {
            count++;
            num = num / 10;
        }

        // Restore original number
        num = original;

        // Calculate Armstrong sum
        while (num != 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, count);
            num = num / 10;
        }

        // Compare
        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}