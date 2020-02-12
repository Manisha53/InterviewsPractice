package LinkedLists;
import java.util.*;
import java.util.LinkedList;

public class KtoLast {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Enter the # elements:");
        int n=in.nextInt();

        System.out.println("Enter the list elements:");
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        System.out.println("List: ");
        for(Integer x:list){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter k: ");
        int k=in.nextInt();

        System.out.println("K to Last elements of the list are:");
        for(int i=k-1;i<n;i++){
            System.out.print(list.get(i)+" ");
        }



    }
}
