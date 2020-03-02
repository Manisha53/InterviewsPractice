package Arrays;

import java.util.Scanner;

public class MinimumPlatforms {
    public static void main(String arg[]){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the number of trains");
        int n=in.nextInt();
        System.out.println("Enter the time of arrival of the trains");
        //int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){            //arrival times
            a[i]=in.nextInt();
        }

        System.out.println("Enter the time of departure of the trains");
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            d[i]=in.nextInt();          // departure times
        }

        int k=1;         //next train
        int j=0;         //previous train
        int res=1,plat_need=1;
        while(k<n && j<n){
            if(a[k]<=d[j]){
                plat_need++;
                k++;
                res=plat_need>res?plat_need:res;
            }
            else{
                plat_need--;
                j++;
            }
        }
System.out.println("Minimum number of platforms required is: "+ res);

    }
}
