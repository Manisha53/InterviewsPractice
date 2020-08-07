/* Input two strings and if they contain same letters then print same else print diffrent.
*/
import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        int m=s.length();
        int n=t.length();
        int c=0;
        
        if(m==n){
            
                char a1[]=s.toCharArray();
                char a2[]=t.toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
        
            for(int i=0;i<m;i++){
                if(a1[i]==a2[i]) c++;
            }
            
            if(c==m) System.out.println("Same");
           
        }
        else
        System.out.println("Different");
     }
}
