package Accenture;


import java.util.*;
import java.lang.*;

    class CurrencyCalculator{
        public static void main (String[] args)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the currency code");
            String code=in.next();
            //private static DecimalFormat df=new DecimalFormat("0.00");
            double res=0;
            switch(code){
                case "HKD":
                    System.out.println("Enter the amount");
                    int amount=in.nextInt();
                    res=8.86*amount;
                    String val=String.format("%.2f",res);
                    System.out.println("Hong Kong dollar "+amount+" equals to "+val+" Indian Rupee");
                    break;
                case "CAD":
                    System.out.println("Enter the amount");
                    int a1=in.nextInt();
                    res=52.08*a1;
                    String val1=String.format("%.2f",res);
                    System.out.println("Canada dollar "+a1+" equals to "+val1+" Indian Rupee");
                    break;
                case "SGD":
                    System.out.println("Enter the amount");
                    int a2=in.nextInt();
                    res=51.29*a2;
                    String val2=String.format("%.2f",res);
                    System.out.println("Singapore dollar "+a2+" equals to "+val2+" Indian Rupee");
                    break;
                case "USD":
                    System.out.println("Enter the amount");
                    int a3=in.nextInt();
                    res=69.55*a3;
                    String val3=String.format("%.2f",res);
                    System.out.println("USA dollar "+a3+" equals to "+val3+" Indian Rupee");
                    break;
                default:
                    System.out.println("Currency code not found");
            }
        }
    }
