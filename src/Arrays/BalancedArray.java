package Arrays;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int mid=n/2;
        int sleft=0,srght=0;
        int j=n-1;
        for(int i=0;i<mid;i++){
            sleft+=a[i];
            srght+=a[j];
            j--;
        }
        if(sleft==srght){
            System.out.println("The array is balanced already");
        }
        else{
            String dir=(sleft-srght >0)?"left":"right";
            int res=Math.abs(sleft-srght);
            System.out.println("The array can be balanced by adding "+ res + " to "+dir);
        }
    }
}
