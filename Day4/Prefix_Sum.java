package Day4;
import java.util.*;
public class Prefix_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        System.out.print("Prefix Sum Array: "+Arrays.toString(arr));
    }
}
