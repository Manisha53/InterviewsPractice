/******************************************************************************
Prime numbers ending with one


Write a program that prints a series of prime numbers that end with 1.

Prompt the user for the first number (n1) and the last number(n2) in the series.

Print all possible prime numbers that ends with one from n1 to n2.

If n2 itself is prime, stop the series.  Else print the nearest prime number that ends with one,  next to n2.


Sample input:

Enter the first number

10

Enter the last number

100

Sample output:

11,31,41,61,71,101

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    
		System.out.print("Enter:");
		int n1=in.nextInt();
		System.out.println();
		System.out.print("Enter:");
		int n2=in.nextInt();
		
		
		
		for(int i=n1;i<n2;i++){
		    if(isprime(i) && i%10 == 1){
		        System.out.println(i+" ");
		    }
		}
		if(isprime(n2) && n2%10==1) System.out.println(n2);
		else {
		    while(n2%10 != 1){      //heart of the sol
		        n2++;
		    }
		    while(!isprime(n2)){
		       n2+=10; 
		    }
		    System.out.println(n2);
		}
		
	}
	public static boolean isprime(int n){
	    boolean flag=true;
	    if(n==1 || n==0 || n==2) flag=true;
	    else if(n>2){
	        for(int i=2;i<=Math.sqrt(n);i++){
	            if(n%i==0){
	               flag=false;
	               break;
	            }
	        }
	    }
	    return flag;
	}
}
