package Accenture;

import java.util.*;

class CountConsecutiveRepetiveChars{

    static boolean isunique(String s){             //if all characters are unique
        boolean res=false;
        HashSet<Character> set=new HashSet();
        for(int i=0;i<s.length();i++){
            res=set.add(s.charAt(i));
            if(res==false) break;
        }
        return res;
    }

    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        boolean unique=isunique(s);
        if(unique==true){
            System.out.print(s);
        }
        else{
            for(int i=0;i<s.length();i++){
                int count=1;
                while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                    count++;
                    i++;
                }

                System.out.print(s.charAt(i)+""+count);
            }

        }
    }
}