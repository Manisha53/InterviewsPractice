package Strings;

import java.util.Scanner;

public class Permutation {

    static String per(String s, String r){
        String res="";
        if(s.length()==0){
            System.out.println(r);
            return res;
        }
        else{

            for(int i=0;i<s.length();i++){
                char x=s.charAt(i);
                res=s.substring(0,i)+s.substring(i+1);
                String result=per(res,r+x);

            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string whose permutation is desired:");
        String s=in.next();
        String res="";
        String result=per(s,res);
    }
}
