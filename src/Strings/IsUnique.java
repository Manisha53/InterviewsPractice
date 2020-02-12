package Strings;

import java.util.Scanner;

public class IsUnique {

    static boolean unique(StringBuffer str){
        for (int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        StringBuffer s=new StringBuffer();
        System.out.println("Enter any string:");
        s.append(in.next());
        //int c=0;
        System.out.println("String: "+ s);
        System.out.println(unique(s));

    }

}
