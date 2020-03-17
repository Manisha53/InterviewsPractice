package Accenture;

import java.util.*;

class CharactersDescending{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();

        int alpha[]=new int[26];

        for(int i=0;i<str.length();i++){
            alpha[str.charAt(i)-'a']++;
            if(alpha[str.charAt(i)-'a']>=2){ //eliminating character repeatition
                alpha[str.charAt(i)-'a']=1;
            }
        }

        for(int i=25;i>=0;i--){
            if(alpha[i]==1){

                System.out.print((char)('a'+i));
            }

        }

    }
}