package Accenture;


import java.util.*;

class SortFirstHalfDescendingAndNextAscending{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=in.nextInt();

        if(n<=0) System.out.println("Array size should be greater than 0");
        else{
            int m=n;

            if(n%2==0){
                n=n/2;
            }
            else{
                n=(n/2)+1;
            }
            System.out.println("Enter the elements:");
            int start[]=new int[n];
            int end[]=new int[m-n];

            for(int i=0;i<n;i++){
                start[i]=in.nextInt();
            }
            for(int i=0;i<m-n;i++){
                end[i]=in.nextInt();
            }
            Arrays.sort(start);
            Arrays.sort(end);
            for(int i:start){
                System.out.println(i);
            }
            for(int i=m-n-1;i>=0;i--){
                System.out.println(end[i]);
            }
        }
    }
}