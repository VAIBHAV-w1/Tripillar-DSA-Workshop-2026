package Day2;
import java.util.Scanner;
public class Spiral_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=num++;
            }
            left++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}