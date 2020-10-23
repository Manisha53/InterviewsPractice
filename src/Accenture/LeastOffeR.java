/******************************************************************************
Least offer
Maya buys “N” no of products from a shop. The shop offers a different percentage of discount for each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.

[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]

Sample Input 1:

4

mobile,10000,20

shoe,5000,10

watch,6000,15

laptop,35000,5

Sample Output 1:

shoe

Explanation: the discount on mobile is 2000, the discount on shoe is 500, the discount on watch is 900 and the discount on laptop is 1750. So the discount on shoe is the minimum.

Note: More than one product can have the minimum discount , display those items separated by coma(,)

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    
	    int n=in.nextInt();
	    String name[]=new String[n];
	    int cost[]=new int[n];
	    int dis[]=new int[n];
	    
	    for(int i=0;i<n;i++){
	        String s=in.next();
	    
	        String ar[]=s.split(",");
	        name[i]=ar[0];
	        cost[i]=Integer.parseInt(ar[1]);
	        dis[i]=Integer.parseInt(ar[2]);
	    }
	   // int index=0;
	    String res="";
	    
	    int min=(cost[0]*dis[0])/100;
	    for(int i=1;i<n;i++){
	        if((cost[i]*dis[i])/100 < min) {
	            min=(cost[i]*dis[i])/100;
	           // index=i;
	            res+=name[i]+" ";
	         }
	         else if((cost[i]*dis[i])/100 == min){
	             res+=name[i]+" ";
	         }
	    }
	    System.out.println(res);
	   
	}
}

