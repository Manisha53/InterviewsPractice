package Basics;

import java.util.Scanner;

public class fibonacciWithoutRecursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        System.out.println("Enter the first term");
        int f=in.nextInt();
        System.out.println("Enter the second term");
        int s=in.nextInt();
        System.out.println(f);
        System.out.println(s);

        for(int i=2;i<n;i++){
            int sum=f+s;
            System.out.println(sum);
            f=s;
            s=sum;

        }
    }
}
