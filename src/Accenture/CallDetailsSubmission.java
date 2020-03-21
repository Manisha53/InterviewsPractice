//Main.java
     import java.util.*;
     import java.lang.*;
     
     public class Main{
         public static void main (String[] args) {
             Call call=new Call();                    //object creation
             Scanner in=new Scanner(System.in);
             System.out.println("Enter the call details:");
             String detail=in.next();
           
            call.parseData(detail);
            
        }
        
    }
    
//Call.java
     import java.util.*;
     import java.lang.*;
     
     public class Call{
         
         private int callId;
         private long calledNumber;
         private float duration;
         
        public void parseData(String s){
            String ar[]=s.split(":");
               callId=Integer.parseInt(ar[0]);
                calledNumber=Long.parseLong(ar[1]);
                duration=Float.parseFloat(ar[2]);
            System.out.println("Call id:"+callId);
            System.out.println("Called number:"+calledNumber);
            System.out.println("Duration:"+duration);
       }
        //getters
        
        public int getCallId(){
            return callId;
        }
        
        public long getCalledNumber(){
            return calledNumber;
        }
        public float getDuration(){
            return duration;
       }
        
    }
