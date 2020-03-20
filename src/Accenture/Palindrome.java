package Accenture;

import java.util.*;
        import java.util.regex.Pattern;
        import java.util.regex.Matcher;
class Palindrome{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word :");
        String word=in.nextLine();

        Pattern p=Pattern.compile("[^A-Za-z]");
        Matcher m=p.matcher(word);
        boolean b=m.find();
        if(b || word.contains(" ")){
            System.out.println("Invalid Input");
        }
        else{
            String wordl=word.toLowerCase();

            int len=wordl.length();
            String rev="";
            for(int i=len-1;i>=0;i--){
                rev+=wordl.charAt(i);
            }
            if(wordl.equals(rev)){
                System.out.println(word+" is a Palindrome");
            }
            else{
                System.out.println(word+" is not a Palindrome");
            }
        }}
}