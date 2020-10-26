/*
Sentence - Convert to upper and lower
Write a program to get a sentence as input. In the first word of the sentence keep the first character as it is and change the remaining to upper case, then in the second word keep the first two characters as it is and change the remaining to upper case. Continue this pattern for the remaining words too.

Sample Input1:

java is a programming language

Sample Output1:

jAVA is a progRAMMING languAGE

Sample Input1:

good programming practice

Sample Output1:

gOOD prOGRAMMING praCTICE
************************************************************************************************************************
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		String input=in.nextLine();
		String s[]=input.split(" ");
		int index=0;
		
		for(int i=0;i<s.length;i++){
		   int l=s[i].length();
		   index++;
		   if(l<=index) System.out.print(s[i]+" ");
		   else{
		       String res=s[i].substring(0,index)+s[i].substring(index).toUpperCase();
		       System.out.print(res+" ");
		   }
		   
		}
		
	}
}
