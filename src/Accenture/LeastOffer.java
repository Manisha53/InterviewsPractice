import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        ArrayList<String> name=new ArrayList<String>();
        ArrayList<Integer> price=new ArrayList<Integer>();
        ArrayList<Integer> discount=new ArrayList<Integer>();
        
        
        for(int i=0;i<n;i++){
            String input=in.next();
            String ar[]=input.split(",");
            name.add(ar[0]);
            price.add(Integer.valueOf(ar[1]));
            discount.add(Integer.valueOf(ar[2]));
        }
        

        String res=name.get(0);
        int min=(price.get(0)*discount.get(0))/100;
        int k=0;
        
        
        for(int i=1;i<n;i++){
        
            if((price.get(i)*discount.get(i))/100 < min){
                min=(price.get(i)*discount.get(i))/100;
                k=i;
                res=name.get(k);
            
        
            }
            else if((price.get(i)*discount.get(i))/100 == min){
                res=res+","+name.get(i);
            }
           
        }
        
        System.out.println(res);
        
        
        
        
    
    }
}
