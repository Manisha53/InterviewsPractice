package Accenture;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Distance:");
        int d=in.nextInt();
        int c=0;
        int temp=d;
        if(d<0){
            System.out.println("Invalid Input");
        }
        else if(d==0){
            System.out.println("Bonus:"+0);
        }
        else{
            while(temp>0){
                temp=temp/10;
                c++;
            }
            temp=d;
            int odd=1;
            int even=1;
            int x[]=new int[c];
            for(int i=0;i<c;i++){
                x[i]=d%10;
                d=d/10;
            }

            for(int i=0;i<c;i++){
                if(i%2!=0){
                    even*=x[i];
                }
                else{
                    odd*=x[i];
                }
            }

            System.out.println("ODD PRODUCT"+odd);
            System.out.println("EVEN PRODUCT"+even);
            if(odd>even){
                System.out.println("Bonus:"+odd);
            }
            else if(even>odd){
                System.out.println("Bonus:"+even);
            }
            else{
                System.out.println("Bonus:"+2*even);
            }
        }

    }
}
