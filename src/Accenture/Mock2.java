//Enter string and repeat it 5 times without space then input x and y for positions. if the charater at x and character at y are same output "same" else output "different".
import java.util.*;

public class Main{
     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int x=in.nextInt();
        int y=in.nextInt();
        int len=s.length();
        int len1=len*5;
        if(x+y <= len1){
            int dif=y-x;
            if(dif%len==0) System.out.println("Same");
            else System.out.println("Different");
        }
        
     }
}
