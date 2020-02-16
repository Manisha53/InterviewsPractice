package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

    static String sort(String s){
        char [] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    static Boolean permutation(String s,String t){
        if(s.length()!= t.length()){
            return false;
        }
       return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter string1:");
        String s=in.next();
        System.out.println("Enter string2:");
        String t=in.next();

        System.out.println( permutation(s,t));

    }
}
