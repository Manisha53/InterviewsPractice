package Basics;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
       // int n=4;
        int n=0;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<Integer>();
        System.out.println("Enter the integers");
        while( n<=5){
            ar.add(in.nextInt());
            n++;
        }
//        for(int i=0;i<n;i++){
//
//        }
        System.out.println("ArrayList size:"+ar.size());
        System.out.println("Following is the list");
        for(int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
