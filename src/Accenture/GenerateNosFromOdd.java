package Accenture;

import java.util.*;

class GenerateNosFromOdd{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=in.nextInt();

        if(n<=0){
            System.out.println("Invalid array size");
        }
        else{
            System.out.println("Enter the array elements:");

            int a[]=new int[n];
            ArrayList<Integer> res=new ArrayList<Integer>();

            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }

            for(int i:a){
                if((i>0 && i<10) && (i%2!=0)){   //logic
                    res.add(i);
                }
            }
            if(res.isEmpty()){
                System.out.println("Single digit odd number is not found in the array");
            }
            else{
                for(int i:res){                         //result
                    System.out.print(i);
                }
            }
        }
    }
}