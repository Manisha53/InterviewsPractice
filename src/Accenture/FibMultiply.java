package Accenture;

import java.util.Scanner;

public class FibMultiply {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first= in.nextInt();
        if(first<=0){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Enter the second number:");
            int sec=in.nextInt();
            if(sec<=0 || first>=sec){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Enter the number of terms:");
                int n=in.nextInt();
                if(n<=0) System.out.println("Invalid");
                else{
                    System.out.print(first+","+sec);
                    for(int i=0;i<n;i++){
                        int mul=first*sec;
                        System.out.print(","+mul);
                        first=sec;
                        sec=mul;
                    }

                }

        }


        }
    }
}
