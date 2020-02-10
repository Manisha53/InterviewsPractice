package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAbsoluteDifference {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        ArrayList<Integer> a =new ArrayList<>(n);
        System.out.println("Enter array :");
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        int res=maxArr(a);
        System.out.println("Maximum value is:");
        System.out.println(res);
    }


    public static int maxArr(ArrayList<Integer> A) {
        int n=A.size();
        int f=0;
        int ne=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                f=Math.abs(A.get(i)-A.get(j))+Math.abs(i-j);
                if(ne<f){
                    ne=f;
                }
            }
        }
        return ne;
    }


}
