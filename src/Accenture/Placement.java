package Accenture;

import java.util.Scanner;

public class Placement {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=in.nextInt();
        int e=in.nextInt();
        int m=in.nextInt();
        System.out.println("Highest placemnet");
        if(c==e){
            if(c>e && c>m){
                System.out.println("CSE");
                System.out.println("ECE");
        } else if(c==m){
                System.out.println("MECH");
            }
        }

        if(e>c && e>m){
            System.out.println("ECE");
            if(c==e){
                System.out.println("CSE");
            }
            else if(e==m){
                System.out.println("MECH");
            }
        }

        if(m>e && m>c){
            System.out.println("MECH");
            if(m==e){
                System.out.println("ECE");
            }
            else if(c==m){
                System.out.println("CSE");
            }
        }
    }
}
