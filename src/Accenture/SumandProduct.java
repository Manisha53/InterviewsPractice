package Accenture;

    import java.util.*;
    class SumandProduct{
        public static void main (String[] args) {
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            if(x<=0){
                System.out.println("Invalid Input");
            }
            else{
                int y=in.nextInt();
                if(y<=0){
                    System.out.println("Invalid Input");
                }
                else{

                    int add=x+y;
                    int mul=x*y;

                    int rev_add=0;
                    while(add!=0){
                        int digit=add%10;
                        rev_add=rev_add*10+digit;
                        add=add/10;
                    }

                    if(rev_add==mul){
                        System.out.println("You are Lucky! Here Is your Gift.");
                    }
                    else{
                        System.out.println("Better Luck Next Time");
                    }
                }
            }
        }
    }
