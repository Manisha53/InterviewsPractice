package Accenture;

import java.util.*;

class DecimalToFraction{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        double n=in.nextDouble();
        double d=1;
        String text=Double.toString(Math.abs(n));

        int integerplaces=text.indexOf('.');
        int decimalplaces=text.length()- integerplaces-1;

        if(n%1==0){
            System.out.println("Input a decimal number");
        }

        else{

            int i=(int)(n*power(10,decimalplaces));
            int j=(int)(d*power(10,decimalplaces));


            int commonfactor=cf(i,j);
            System.out.println("Fraction:" + i/commonfactor+"/"+j/commonfactor);
        }
    }

    public static int power(int base,int exp){
        int res=1;
        for(int i=1;i<=exp;i++){
            res*=base;
        }
        return res;
    }

    public static int cf(int num,int div){
        if(div==0){
            return num;
        }
        return cf(div,num%div);
    }
}