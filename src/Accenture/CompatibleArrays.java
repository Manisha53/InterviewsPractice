package Accenture;

import java.util.Scanner;

public class CompatibleArrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

       // int flag=0;
        int count=0;

        System.out.println("n1: ");
        int n1=in.nextInt();

        if(n1<=0){
            System.out.println("Invalid");
        }
        else{

            System.out.println("a1: ");
            int a1[]=new int[n1];

            for(int i=0;i<n1;i++){
                a1[i]=in.nextInt();
            }
            System.out.println("n2: ");
            int n2=in.nextInt();

            if(n2<=0){
                System.out.println("invalid");
            }
            else{

                System.out.println("a2:");
                int a2[]=new int[n2];

                for(int i=0;i<n2;i++){
                    a2[i]=in.nextInt();
                }

                if(n1==n2){
                    int n=n1;
                    for(int i=0;i<n;i++){
                        if(a1[i]>=a2[i]){
                            count++;
                        }

                    }

                    if(n==count){
                        System.out.println("yes");
                    }
                    else{
                        System.out.println("not");
                    }

                }
            }


        }


    }
}
