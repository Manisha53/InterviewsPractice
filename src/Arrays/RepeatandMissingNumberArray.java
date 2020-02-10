package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatandMissingNumberArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
       // ArrayList<Integer> b= new ArrayList<>();
        System.out.println("Enter the size of list");
        int n=in.nextInt();
        int sum=n*(n+1)/2;
        int x=0;

      // System.out.println("sum to n terms is: "+sum);

        System.out.println("Enter the list you want to check");

        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        for(int i=0;i<a.size();i++){
            if(Collections.frequency(a,a.get(i))>1){
                System.out.println("Duplicate number is: "+a.get(i));
                break;
            }
        }

        List<Integer> b=a.stream().distinct().collect(Collectors.toList());

//        for(int i=0;i<b.size();i++){
//            System.out.println(b.get(i));
//        }

        for(int i=0;i<b.size();i++){
            sum-=b.get(i);
        }

        System.out.println("Missing number is: "+ sum);

    }
}
