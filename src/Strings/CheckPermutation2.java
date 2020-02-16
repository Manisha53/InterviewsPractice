package Strings;

import java.util.Scanner;

public class CheckPermutation2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s=in.next();
        System.out.println("Enter string 2:");
        String t=in.next();
        String res="";
        if(s.length()!=t.length()){
            System.out.println("No");
        }

        else{
            char[] s1=s.toCharArray();
            int[] alpha=new int[128];        //for ASCII
            for(char c: s1){
                alpha[c]++;
            }

            for(int i=0;i<t.length();i++){
                int c=(int) t.charAt(i);
                alpha[c]--;
                if(alpha[c]<0){                  //unequal number of alphabets in the two strings
                    res="no";
                    break;
                }
                else{
                    res="yes";
                   // System.out.println("yes");

                }
            }
            System.out.println(res);
        }





    }
}
