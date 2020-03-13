package Accenture;

import java.util.Scanner;

public class PrimeEndingOne {

    public static Boolean prime(int x){
        boolean flag=true;
        if(x<=0 ||x==1 ){
            flag=false;
        }
        else if(x==2){
            flag=true;
        }
        else{
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    flag=false;
                    break;
                }

            }
        }
        return flag;
    }

    public static void printprime(int i,int n2){

        for(int k=i;k<n2;k=k+10) {
            if (prime(k)) {
                System.out.print(k + ",");

            }
        }

    }

    public static int checkLast(int last) {
        if (last % 10 != 1) {
            while (last % 10 != 1) {
                last++;
            }
            //System.out.print("last " + last);
                if(prime(last) && last%10==1) {
                    System.out.print(last + " ");

                } else {
                    checkLast(last+10);

                }
            }
        else {
            if (prime(last)) {
                System.out.print(last + " ");
            }
        }
            return last;
        }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n1:");
        int n1=in.nextInt();
        System.out.println("n2:");
        int n2=in.nextInt();

        int i=n1;
        if(i%10!=1){
            while(i%10!=1){
                i++;
            }
        }

        printprime(i,n2);             //primes in range n1 to n2

        if(prime(n2) && n2%10 == 1){
            System.out.println(n2);
        }else{
            checkLast(n2+1);
        }
        }
    }
//5/6 testcases passed
//for 6/6 visit "Bhaiya.java"

