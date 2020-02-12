package LinkedLists;

import java.util.Scanner;

public class LinkedList {             //linkedlist class

     static class Node{
        int data;
        Node next;

         Node(int d){
            data=d;
            next=null;
        }
    }
    static Node head;

     void printlist(Node node){               //print list
         while(node!=null){
             System.out.print(node.data+" ");
             node=node.next;
         }
     }

     void remove(){
         Node one=null,two=null,dup=null;
         one=head;
         while(one!=null && one.next!=null){
             two=one;
             while(two.next!=null) {
                 if (one.data == two.next.data) {
                     dup = two.next;
                     two.next = two.next.next;

                 } else {                                   //if not else then,null pointer exception
                     two = two.next;
                 }
             }
             one=one.next;
         }
     }



    public static void main(String[] args) {              //main
        Scanner in=new Scanner(System.in);
        LinkedList list=new LinkedList();
        System.out.println("Enter the # nodes ");           //insertion or user input
        int x=in.nextInt();
        System.out.println("Enter the nodes ");
        for(int i=0;i<x;i++){
            int a=in.nextInt();
            Node n= new Node(a);

            if(list.head==null){
                list.head=n;
            }
            else{
                Node b=list.head;
                while(b.next!=null){
                    b=b.next;
                }
                b.next=n;
            }
        }

        System.out.println("Linked list before removing duplicates");
        list.printlist(head);
        System.out.println();
        list.remove();
        System.out.println("Linked list after removing duplicates");
        list.printlist(head);

    }
}
