package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter k: ");
        int k=in.nextInt();

        Arrays.sort(a);
        System.out.println("Kth element is: "+ a[k-1]);
    }
}
