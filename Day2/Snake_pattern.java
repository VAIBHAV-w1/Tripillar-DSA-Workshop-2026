package Day2;

import java.util.Scanner;

public class Snake_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        int num=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=num++;
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    arr[i][j]=num++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
