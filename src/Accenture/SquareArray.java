package Accenture;

import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        for(int i:a){
            sum+=i*i;
        }
        int add=sum;
        System.out.println("sum "+sum);
        for(int i:a){
            sum=add;
            sum-=i*i;
            System.out.println(sum);
        }
    }
}
