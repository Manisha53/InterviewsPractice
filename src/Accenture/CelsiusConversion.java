package Accenture;

import java.util.Scanner;

public class CelsiusConversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Celsius");
        int c=in.nextInt();
        double f;
        f= (9.0/5.0)*c + 32;
        //f= f * 10 / 10.0;

        System.out.println(String.format("%.1f",f));
    }
}
