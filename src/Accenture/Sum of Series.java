/*
Write a Program to print the sum of the following series.

SUM = -X + X2 - X3 + X4 - X5+ ... n terms

Prompt the user to enter the first number and the nth term.

 Both the input numbers  should be  positive, else  print as “Invalid Input”

Display the result along with the message, “The sum of the series is a positive number” or “The sum of the series is a negative number”

[Note: The sign of the alternate number changes.]


Sample input 1

Enter the first number

45

Enter the nth number

8

Sample output 1

-45+46-47+48-49+50-51+52=4

The sum of the series is a positive number



Sample input 2

Enter the first number

-2

Enter the nth number

9

Sample output 2

Invalid Input
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		int first=in.nextInt();
		System.out.println("Enter the nth number");
		int n=in.nextInt();
		if(first<0 || n<0){
		    System.out.println("Invalid Input");
		}
		else{
		    int sum=0;
		    for(int i=0;i<n;i++){
		       if(i%2!=0){
		           int next=first++;
		           System.out.print("+"+next);
		           sum=sum+next;
		       } 
		       else{
		           int next=first++;
		           System.out.print("-"+next);
		           sum=sum-next;
		       }
		    }
		    System.out.print("="+sum);
		    System.out.println();
		    if(sum>0)  System.out.println("The sum of the series is a positive number");
		    else System.out.println("The sum of the series is a negative number");
		}
	
	}
}
