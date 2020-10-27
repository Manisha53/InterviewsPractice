package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n=in.nextInt();
        int a[]=new int[n];
        int sum=0;
        int flag=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(n>0){
            System.out.println("Enter the numbers");
            for(int i=0;i<n;i++){
                sum=0;
                int x=in.nextInt();
                int y=x;
                if(x>9){
                    a[i]=x;
                }
                else{
                    System.out.println("Provided "+x+" is not valid");
                    return;
                }
                while(x>0){
                    sum+=x%10;
                    x=x/10;
                }
                if(y%sum==0) {
                    flag++;
                    res.add(y);
//                    System.out.println(y);
                }

            }
            if(flag==0){
                System.out.println("The "+n+" values are not harshad number");
            }else{
                for(int i:res)
                System.out.println(i);
            }

        }
        else{
            System.out.println(n+" is invalid limit");
        }


    	// write your code here
    }
}
