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

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string length/no. of words in the string");
        int n=in.nextInt();
        System.out.println("Enter the string words");

        Stack<String> stack = new Stack<String>();

        for(int i=0;i<n;i++){
            stack.push(in.next());
        }
        System.out.println("Reversed string is");
        for(int i=0;i<n;i++){
            System.out.println(stack.pop());
        }

    }
}
