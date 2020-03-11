package Accenture;

import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("number");
        int n=in.nextInt();
        if(n==0){
            System.out.println("No Factors");
        }
        else{
            //System.out.print(1+",");
            if(n<0){
                n=-n;
            }
            for(int i=1;i<n;i++){
                if(n%i==0){
                    System.out.print(i+",");
                }
            }
            System.out.print(n);
        }


    }
}
