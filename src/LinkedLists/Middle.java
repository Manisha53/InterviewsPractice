package LinkedLists;

import java.util.Scanner;

public class Middle {
    public static class LinkedList {
        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }

        }

        static Node head;
        static LinkedList list = new LinkedList();
        
        static void listprint(){
           
            Node c = list.head;
            while (c != null) {
                System.out.print(c.data + " ");
                c = c.next;
            }
            System.out.println();
        }

        static int mid(){                      //middle element of list
            int middle;
            if(list.head==null){
                System.out.println("List does not exist");
                return 0;
            }
            else{
                Node slow=list.head;
                Node fast=list.head;
                //Node prev=list.head;
                while(fast.next!=null && fast.next.next!=null){  //when even no. of terms,it will take lower limit.If(fast!=null && fast.next!=null) then will take upper limit.

                    slow=slow.next;
                    fast=fast.next.next;

                }
                middle=slow.data;

            }

           return middle;
        }


        public static void main(String[] args) {            //main
            Scanner in = new Scanner(System.in);
            
            System.out.println("Enter the # nodes: ");                         //creating list
            int n = in.nextInt();
            System.out.println("Enter the  nodes: ");
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                Node first = new Node(a);

                if (list.head == null) {
                    list.head = first;
                } else {
                    Node after = list.head;
                    while (after.next != null) {
                        after = after.next;
                    }
                    after.next = first;
                }

            }
            System.out.println("Given list is:");             //printing list
            listprint();


            System.out.println("Middle element: "+mid());

        }

    }
}