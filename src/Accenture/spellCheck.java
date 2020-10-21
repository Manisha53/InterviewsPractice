import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.println("ENter the word");
	    char[] rain=new char[7];
	    for(int i=0;i<7;i++){
	        rain[i]=in.next().charAt(0);
	    }
	    char wrong[]={'r','a','i','n','b','o','w'};
	    if(Arrays.equals(rain,wrong)){
	        System.out.println(wrong);
	    }
	    else{
	        System.out.println(1);
	    }
	}
}
