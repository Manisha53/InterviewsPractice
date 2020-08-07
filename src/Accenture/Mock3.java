/* WAP to get the string an input from the user and display the alphabets in the string in descending order and eliminate the repeatition, assuming all characters given are in lowercase.
*/
import java.util.*;

public class Main{
     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        char a[]=s.toCharArray();
        
        Arrays.sort(a);
        char b=a[len-1];
        System.out.print(b);
        for(int i=len-2;i>=0;i--){
            if(a[i]!=b) System.out.print(a[i]);
            b=a[i];
        }
        System.out.println();
     }
}



/*
output:
love : vole
programming :rponmiga
*/
