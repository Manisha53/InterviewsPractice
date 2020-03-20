package Accenture;

import java.util.*;

class ConvertToUpperAndLower{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String a[]=s.split(" ");
        int pos=0;
        for(String i:a){
            pos++;
            int l=i.length();
            if(l<=pos){
                System.out.print(i+" ");
            }
            else{
                String up=i.substring(0,pos)+i.substring(pos).toUpperCase();
                System.out.print(up+" ");
            }
        }
    }
}