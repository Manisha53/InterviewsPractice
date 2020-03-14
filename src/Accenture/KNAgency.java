package Accenture;

import java.util.*;

class KNAgency{
    public static void main (String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 'E' for Electric Kettle and 'I' for Induction Stove(No other character will be accepted)");
        char ch=in.next().charAt(0);
        System.out.println("Enter the number of units ordered");
        int n=in.nextInt();
        int price=0;
        if(n>=1 &&(ch=='E'||ch=='I')){
            switch(ch){
                case 'E':
                    if(n>=1 && n<=10){
                        price=950*n;
                    }
                    else if(n>=11 && n<=20){
                        price=900*n;
                    }
                    else{
                        price=850*n;
                    }
                    System.out.println("Total amount to be paid is Rs."+price);
                    break;
                case 'I':
                    if(n>=1 && n<=15){
                        price=1100*n;
                    }
                    else if(n>=16 && n<=25){
                        price=1000*n;
                    }
                    else{
                        price=975*n;
                    }
                    System.out.println("Total amount to be paid is Rs."+price);

            }
        }
    }
}