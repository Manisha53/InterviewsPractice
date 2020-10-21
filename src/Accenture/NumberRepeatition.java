/*
Repetition of a Number

Pinky’s mom provides Pinky  with a number  and a key digit.  She wants Pinky to find out how many times that key digit appears in that number. 
Help Pinky to do that by writing a program.
Sample Input 1:

Enter the number  16466

Enter the key digit   6

Sample Output 1:

6 appears 3 times in 16466



Sample Input 2:

Enter the number  8458

Enter the key digit   6

Sample Output 2:

6 appears 0 times in 8458
/*
//************************************CODE 1*********************************************************
    1 import java.util.*;
    2 
    3 class NumberRepetition{
    4     public static void main (String[] args) {
    5         Scanner in=new Scanner(System.in);
    6         int c=0;
    7             System.out.println("Enter the number ");
    8             int n=in.nextInt();
    9             System.out.println("Enter the key digit ");
   10             int k=in.nextInt();
   11             int m=n;
   12             while(n>0){
   13                 int s=n%10;
   14                 if(s==k){
   15                     c++;
   16                 }
   17                 n=n/10;
   18             }
   19             System.out.println(k+" appears "+c+" times in "+m);
   20     }
   21 }
   //**************************************************CODE 2***********************************
   import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter number:");
	    String s=in.next();
	    char[] t=s.toCharArray();
	    int c=0;
	    System.out.println("Enter key:");
	    int key=in.nextInt();
	    for(int i=0;i<t.length;i++){
	        if(key==Character.getNumericValue(t[i])){
	            c++;
	        }
	    }
	    System.out.println(s+" contains "+key+" "+c+" times");
	}
}
