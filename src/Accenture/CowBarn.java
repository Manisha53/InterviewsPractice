package Accenture;

import java.util.Scanner;

public class CowBarn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int head=in.nextInt();
        int feet=in.nextInt();
        int cows=(feet-2*head)/2;
        int men=(4*head-feet)/2;

        if(men+cows!=head || cows<0||men<0){
            System.out.println("Invalid Input");
        }
           else{
            System.out.println("Number of Cows: "+cows);
            System.out.println("Number of Men: "+men);
        }
    }

}

