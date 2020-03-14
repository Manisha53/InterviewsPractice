package Accenture;

import java.util.*;

class Numerology_Number{

    public static int sum(int n){
        int temp=n;
        int digits=0;
        int s=0;

        while(n>0){
            temp=n%10;
            digits++;
            s+=temp;
            n=n/10;
        }


        return s;
    }

    public static int numerology(int n){
        if(n==0) return 0;
        return((n%9==9)?9:(n%9));
    }

    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        int temp=num;

        int even_count=0;
        int odd_count=0;

        String n=Integer.toString(num);

        System.out.print("The Numbers are:");

        for(int i=0;i<n.length();i++){
            System.out.print(" "+n.charAt(i));
        }
        System.out.println();

        System.out.println("Sum of digits:"+sum(num));

        System.out.println("Numerology number:"+ numerology(num));

        for(int i=0;i<n.length();i++){
            if((int)n.charAt(i)%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Number of odd numbers:"+odd_count);
        System.out.println("Number of even numbers:"+even_count);
    }
}
