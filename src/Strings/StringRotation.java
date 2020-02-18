package Strings;

import java.util.Scanner;
import java.lang.String;

/*
Assume you have a method i5Substring which checks ifone word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to isSubstring (e.g., Uwaterbottleuis a rotation of uerbottlewat U).
 */
public class StringRotation {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s=in.next();
        System.out.println("Enter the string2:");
        String t=in.next();
        String ss=s+s;
        if(s.length()!=t.length() || s.length()<0 || t.length()<0){
            System.out.println("operation not possible ,enter strings having same length");
        }
        else{
            if(ss.contains(t)){
                System.out.println("Yes,String rotation ");
            }
            else{
                System.out.println("No String rotation");
            }
        }


    }
}
