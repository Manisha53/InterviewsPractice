/*Pencil Count


Nila uses pencils to write at school and at home. When she was in her 1st standard, her parents bought her one pencil. In her 2nd standard, she needed 5 pencils, and in 3rd standard, she needed 14 pencils and so on. How many pencils does she get from the provided standard?

Note : If the input given is not between 1 to 12  then the output should be "Invalid Standard"

Sample Input 1:
Enter the standard: 4
Sample Output 1:
Nila gets 30 pencils



Sample Input 2:
Enter the standard: 5
Sample Output 2:
Nila gets 55 pencils



Sample Input 3:
Enter the standard:14
Sample Output 3:
Invalid Standard

**********************************************************************************************************
RECURSION VERSION ,EASIER VERSION IS ON TEKSTAC
*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.println("Standard:");
	    int s=in.nextInt();
	    if(s>=1 && s<=12){
	    int pencil=sum(s);
	    System.out.println(pencil);
	    }
	    else{
	        System.out.println("Invalid standard");
	    }
	}
	public static int sum(int x){
	    if(x==1) return 1;
	    else{
	        x=(int)Math.pow(x,2)+sum(x-1);   
	    }
	    return x;
	}
}
