package Day1;

import java.util.*;

public class Happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num != 1 && num != 4) {
            int sum = 0;

            while (num != 0) {
                int rem = num % 10;
                sum += rem * rem;
                num /= 10;
            }

            num = sum;
        }

        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Sad Number");
        }

    }
}