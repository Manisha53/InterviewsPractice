package Basics;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int m=n-1;
        if(n==1){
            System.out.println("Yes");
        }
        else{
            int res=n&m;
            if(res==0)
               System.out.println("Yes");
            else
                System.out.println("No");

           }

        }
    }

