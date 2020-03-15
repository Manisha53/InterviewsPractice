package Accenture;

import java.util.Scanner;

public class FindAvgAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number odf employees");
        int n = in.nextInt();
        if (n < 2) System.out.println("Enter valid age");
        else {


            System.out.println("Enter ages:");
            int age[] = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                age[i] = in.nextInt();
                if (age[i] < 28 || age[i] > 40) {
                    System.out.println("Enter valid age");
                    break;
                } else {
                    sum += age[i];

                }

            }
            //System.out.println(sum+" "+n);

            double avg = (double) sum / (double) n;
            String res = String.format("%.2f", avg);
            System.out.println(res);
        }
    }
}