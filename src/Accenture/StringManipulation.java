//**********************************STRINGBUFFER***********************************
package com.company;
import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuffer s=new StringBuffer(str);
        System.out.println(s+" "+s.length());
        s.setCharAt(6,'*');
        System.out.println(s);
        s.append("WOW!");
        System.out.println(s);
        s.insert(0,'$');
        System.out.println(s);
        s.setLength(10);
        System.out.println(s);
    }
}
