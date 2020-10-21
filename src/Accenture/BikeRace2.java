/*
Bonus Points - Bike Race


There is an app for  bike race which provides bonus points for the  player.  In this app the player has to play the race and on completion, the total kilometers travelled by the player is calculated. Based on this distance travelled, the product of digits in the odd position and also product of digits in the even position is calculated.  Whichever is highest, that is the bonus points given to the user.   If the product of odd and even position digits are same, then the player should receive double the product as bonus.

Example : If the distance travelled  is 5632 
Product of digits in odd position = 5 * 3 = 15
Product of digits in even  position = 6 * 2 = 12
As 15 > 12, the bonus points the player gets is 15.
Write a program  to do this operation.

Create a class BikeRace.java with the main method.

Note : Input should be the distance travelled and the output is the bonus points.  If the input is less than zero, the output should be “Invalid Input”.  



Sample Input 1 :

Enter the distance travelled

8694

Sample Output 1 :

Your bonus points is 72



Sample Input 2 :

Enter the distance travelled

263

Sample Output 2 :

Your bonus points is 12
*******************************************************************************************************************************
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter distance:");
        Scanner in=new Scanner(System.in);
        String d=in.next();
        
        char s[]=d.toCharArray();
        
        if(s[0]=='-'|| s[0]=='0'){
            System.out.println("INVALID");
        }
        else{
        int odd=1;
        int even=1;
        
        for(int i=0;i<s.length;i++){
            if(i%2==0) odd*=Character.getNumericValue(s[i]);
            else even*=Character.getNumericValue(s[i]);
        }
        System.out.println("Bonus:");
        if(odd==even) System.out.println(odd*2);
        else System.out.println((odd>even?odd:even));
        }
	}
}
