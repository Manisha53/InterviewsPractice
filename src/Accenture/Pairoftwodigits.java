package Accenture;

import java.util.Scanner;

public class Pairoftwodigits {
    public static void main (String[] args) {
                 Scanner in = new Scanner(System.in);
                 int n=in.nextInt();
                 int m=in.nextInt();
                 int mul1=n*m;

                 int rn=(n%10)*10 + n/10; //reverse
                 int rm=(m%10)*10 +m/10;
             //System.out.println(rn+" "+rm);
                 int mul2=rn*rm;
                if(mul1==mul2){
                         System.out.println("Yes");
                     }
                else{
                         System.out.println("No");
                     }

             }
}
