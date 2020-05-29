/*
You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2x=y .

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be 20 .
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.
*/
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String word=in.next();
        int z_count=0,o_count=0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='z') z_count++;
            if(word.charAt(i)=='o') o_count++;
        }
        if(2*z_count==o_count) System.out.println("Yes");
        else System.out.println("No");

    }
}
