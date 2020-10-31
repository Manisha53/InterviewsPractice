package com.company;
import java.util.*;

public class ProductEqualsSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        if(n>=1 && n<=10) {
            int a[] = new int[n];
            int b[] = new int[n];
            int a1[] = new int[n];
            int b1[] = new int[n];
            int p = 1;
            int s = 0;
            int count=0;
            System.out.println("Enter the 1st array");
            for (int i = 0; i < n; i++) {
                int x=in.nextInt();
                if(x>=10 && x<=999)
                    a1[i] = x;
                else {
                    System.out.println("Invalid input");
                    return;
                }
            }
            for (int i = 0; i < n; i++) {
                p = 1;
                int x = a1[i];
                while (x != 0) {
                    p *= x % 10;
                    x = x / 10;
                }
                a[i] = p;

            }
            System.out.println("Enter the 2nd array");
            for (int i = 0; i < n; i++) {
                int x=in.nextInt();
                if(x>=10 && x<=999)
                    b1[i] = x;
                else {
                    System.out.println("Invalid input");
                    return;
                }
            }
            for (int i = 0; i < n; i++) {
                s = 0;
                int y = b1[i];
                while (y != 0) {
                    s += y % 10;
                    y = y / 10;
                }
                b[i] = s;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    count++;
                    if (a[i] == b[j]) {
                        System.out.println(a1[i] + "," + b1[j]);
                    }
                }
            }
            if(count==0) System.out.println("No pair found");
        }else{
            System.out.println("Invalid Array Size");
        }
    }
}
