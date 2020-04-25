/*
When patients enter the Medical care center, the necessary details are collected from them and printed in a card and sent to the doctors who will be examining them.

Write a program that prompts the user for the patient details and displays it in the format as shown in the sample.

Sample input 1:

Enter the name:

Edward

Enter age:

32

Enter Gender('M' or 'F'):

M

Enter Weight:

60.5

Sample output:

Name: Edward

Age: 32

Gender: M

Weight: 60.50

Sample input 2:

Enter the name:

Smith Williams

Enter age:

35

Enter Gender('M' or 'F'):

F

Enter Weight:

60.45

Sample output:

Name: Smith Williams

Age: 35

Gender: F

Weight: 60.45

*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=in.nextLine();
		System.out.println("Enter age:");
		int age=in.nextInt();
		System.out.println("Enter Gender('M' or 'F'):");
		char gender=in.next().charAt(0);
		System.out.println("Enter Weight:");
		float w=in.nextFloat();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Weight: "+w);
	}
}
