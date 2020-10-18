/******************************************************************************

Generate number using odd digits
Jose gets n numbers in an array. Write a Java program to take the single digit odd numbers in the array and make a number by combining those odd numbers alone.

Example: If the array is {2,7,14,24,41,3} the output should be a single number 73, if not found print "Single digit odd number is not found in the array".If the array size is zero or lesser then display the message as "Invalid array size"

Sample Input 1:

Enter the size of an array:

4

Enter the array elements:

45

3

56

7

Sample Output 1:

37


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter array size");
		String str="";
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>0){
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i:a){
            if(i/10 ==0 && i%2!=0) str+=i;
        }
        if(str.length()==0) System.out.println("NO single digit odd present");
        else System.out.println(str);
        }else{
            System.out.println("Invalid array size");
        }
	}
	
}
