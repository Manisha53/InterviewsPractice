package com.company;
import java.util.*;

public class BoxChallenge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("The box contain:");
        int n=in.nextInt();
        int s=0;
        if(n>0) {
            System.out.println("Enter the numbers:");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x > 0) a[i] = x;
                else {
                    System.out.println(x + " is not a valid input");
                    return;
                }
            }

            for (int i : a) {
                s += i % 10;
            }
            if (s % 2 == 0) {
                System.out.println(s + " is even its valid box");
            } else {
                System.out.println(s + " is odd its not valid box");
            }
        }
        else{
            System.out.println(n+" is not a valid input");
        }
    }
}
