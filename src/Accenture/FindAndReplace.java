package Accenture;

import java.util.*;
import java.lang.*;

class FindAndReplace{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=in.nextLine();

        int pos=0;

        System.out.println("Enter the character to be searched:");
        char search=in.next().charAt(0);
        System.out.println("Enter the character to replace:");
        char rep=in.next().charAt(0);

        int flag=0;

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(search==ch[i]){
                pos=i;
                flag=1;
                break;
            }
        }


        if(flag==0){
            System.out.println("character not found");
        }else{
            ch[pos]=rep;
            System.out.println(new String(ch));
        }
    }
}