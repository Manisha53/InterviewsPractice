package Arrays;

import java.util.Scanner;

public class KadaneAlgo {


    static  int kadane(int m[]){
        int max1=0,max2=0;
        for(int i=0;i<m.length;i++){
            max2=max1+m[i];
            if(max2<0){
                max2=0;
            }
            if(max1<max2){
                max1=max2;
            }
        }
        return max1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n=in.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(kadane(a));

    }
}
