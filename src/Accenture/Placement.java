package Accenture;
import java.util.*;

class Placement{
         public static void main (String[] args) {

             Scanner in=new Scanner(System.in);
             System.out.println("Enter the no of students placed in CSE:");
             int c=in.nextInt();
             System.out.println("Enter the no of students placed in ECE:");
             int e=in.nextInt();
             System.out.println("Enter the no of students placed in MECH:");
            int m=in.nextInt();

             //Negative
           if(c<0 || e<0 || m<0){
                     System.out.println("Input is Invalid");
                 }
             //equal
           else if(c==e && e==m){
                     System.out.println("None of the department has got the highest placement");
                 }

           else{
                     System.out.println("Highest placement");
            if(c>e && c>m){                            //if one is highest
                             System.out.println("CSE");
                         }
                   else if(e>c && e>m){
                             System.out.println("ECE");
                        }
                   else if(m>c && m>e){
                            System.out.println("MECH");
                         }
                   else{                                 //2 are same
                       if(c==e){
                               if(c>m){
                                         System.out.println("CSE");
                                         System.out.println("ECE");
                    }
                             }
                       else if(c==m){
                               if(c>e){
                                         System.out.println("CSE");
                                         System.out.println("MECH");
                                     }
                             }
                       else if(m==e){
                               if(m>c){
                                         System.out.println("ECE");
                                         System.out.println("MECH");
                                     }
                             }
                         }
                     }

    }
    }

