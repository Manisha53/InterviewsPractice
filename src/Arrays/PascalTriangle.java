package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> first=new ArrayList<>();

        first.add(1);

        a.add(first);

        for(int i=1;i<n;i++){
            ArrayList<Integer> prev=a.get(i-1);
            ArrayList<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            a.add(cur);

        }
        System.out.print(a);

    }
}
