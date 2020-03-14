package Accenture;

import java.util.*;
import java.lang.*;

class ProfitAndLoss{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the profit percentage");
        int profit=in.nextInt();
        System.out.println("Enter the amount lost in Rs.");
        int lost_amount=in.nextInt();
        String status="";

        int profit_amount=1000*profit;

        int dif_percent=Math.abs((lost_amount - profit_amount)/1000);

        if(profit_amount<lost_amount){
            status="loss";
        }
        else if(profit_amount>lost_amount){
            status="profit";
        }
        else{
            status="no loss or no gain.";
        }

        if(dif_percent!=0){
            System.out.println("After two years he gets a "+status +" of "+dif_percent+"%.");
        }
        else{
            System.out.println("After two years he gets "+status);
        }
    }
}