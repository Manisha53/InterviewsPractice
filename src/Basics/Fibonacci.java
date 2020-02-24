package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {                                    //Recursion

    static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        else{

            return fib(n-1)+fib(n-2);
        }

    }


    public static void main(String[] args) {                        //main
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms more than 2 upto which you want the series:");
        int n=in.nextInt();
        System.out.println("Enter the first element");
        int f=in.nextInt();                //1
        System.out.println("Enter the second element");
        int s=in.nextInt();             //1

        ArrayList a=new ArrayList();
        a.add(f);
        a.add(s);
        for(int i=2;i<n;i++){
            a.add(fib(i));
        }


        for(int i=0;i<a.size();i++){

            System.out.println(a.get(i));

        }


    }
}
