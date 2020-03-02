package Arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("n: ");
        int n=in.nextInt();
        System.out.println("Array");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int res=0;
        Arrays.sort(a);
        int s_last=a[n-2];
        for(int i=0;i<n-2;i++){
            if(a[i]<s_last){
                res+=Math.abs(a[i]-s_last);
            }
            else{
                continue;
            }
        }
        System.out.println("THe sum of water volume is: "+res);
    }
}
