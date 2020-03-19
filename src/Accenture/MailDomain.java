package Accenture;

import java.util.*;

class MailDomain{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        ArrayList<String> ids=new ArrayList<String>();
        for(int i=0;i<n;i++){
            ids.add(in.next());
        }
        String com="zeezee.com";
        for(String s:ids){
            if(!s.contains(com)){
                System.out.println(s);
            }else{
                count++;
            }
        }
        if(count==ids.size()){
            System.out.println("No personal mail id");
        }
    }
}