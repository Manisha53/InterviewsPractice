package Accenture;
import java.util.*;

class PassAndFailCount{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int n=in.nextInt();

        if(n<=0){
            System.out.println("Invalid input range");
        }
        else{
            int pass=0,fail=0;
            int sub[]=new int[n];

            for(int i=0;i<n;i++){
                sub[i]=in.nextInt();
            }

            for(int i:sub){
                if(i>=50) pass++;
                else fail++;
            }

            if(pass==n || fail==0){
                System.out.println("Ram passed in all subjects");
            }
            else if(pass==0 || fail==n){
                System.out.println("Ram failed in all subjects");
            }
            else{
                System.out.println("Ram passed in "+pass+" subjects and failed in "+fail+" subjects");
            }
        }
    }
}