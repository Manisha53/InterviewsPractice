/*
/*
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
 */

package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rev {

    static String reverseWords(String s){

        Pattern p=Pattern.compile("\\s");
        String a[]=p.split(s);
        String res="";
        for(int i=0;i<a.length;i++){
           // res=" "+a[i]+res;
            if(i==a.length-1){
                res=a[i]+res;
            }
            else{
                res=" "+a[i]+res;
            }

        }

return  res;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        System.out.println(reverseWords(s));
    }
}
