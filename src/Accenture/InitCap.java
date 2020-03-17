package Accenture;

import java.util.*;
import java.lang.*;

class InitCap{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=in.nextLine();
        int count=0;

        String word[]=s.split("\\s");
        String res="";
        for(String st:word){

            String first=st.substring(0,1);
            char ch=first.charAt(0);

            if(!Character.isUpperCase(ch)){
                String rest=st.substring(1);
                res+=first.toUpperCase()+rest+" ";
            }else{
                count++;
                res+=st+" ";
            }
        }
        if(count==word.length){
            System.out.println("First character of each word is already in uppercase");
        }else{
            System.out.println(res.trim());
        }
    }
}