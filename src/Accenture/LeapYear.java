package Accenture;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=in.nextInt();
        int t=year;
        int c=0;
        while(t>0){
           // t=t%10;
            c++;
            t=t/10;
        }
        System.out.println(c+" ");
        if(c==4 && year>0) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap");
            } else {
                System.out.println("Not Leap");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
