package LinkedLists;

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

        LinkedList list=new LinkedList();
        list.head=new Node(10);
        list.head.next=new Node(12);
        list.head.next.next=new Node(11);
        list.head.next.next.next=new Node(11);
        list.head.next.next.next.next=new Node(12);

        System.out.println("Linked list before removing duplicates");
        list.printlist(head);

        list.remove();
        System.out.println("Linked list after removing duplicates");
        list.printlist(head);

    }
}
