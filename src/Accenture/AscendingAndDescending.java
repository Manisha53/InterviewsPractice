package Accenture;

import java.util.*;

class AscendingAndDescending{

    public static String removeDup(String word){

        Set<Character> chars=new HashSet<>();
        StringBuilder output=new StringBuilder(word.length());
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(chars.add(ch)){
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static void main (String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.next();

        String t=removeDup(s);
        int n=t.length();
        if(n%2!=0){
            n=(n/2)+1;
        }
        else{
            n=n/2;
        }

        int alpha[]=new int[26];
        int beta[]=new int[26];
        String dec=t.substring(0,n);
        String asc=t.substring(n);

        for(int i=0;i<dec.length();i++){
            alpha[dec.charAt(i)-'a']++;
        }
        for(int i=25;i>=0;i--){
            if(alpha[i]==1)
                System.out.print((char)('a'+i));
        }
        for(int i=0;i<asc.length();i++){
            beta[asc.charAt(i)-'a']++;
        }
        for(int i=0;i<=25;i++){
            if(beta[i]==1)
                System.out.print((char)('a'+i));
        }

    }
}