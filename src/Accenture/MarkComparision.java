package Accenture;

import java.util.*;

class MarkComparision{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int flag=0;
        int neg=0;

        int n1=in.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=in.nextInt();
            if(a[i]<0){
                neg=1;
                break;
            }
        }
        if(neg==1){
            System.out.println("No Negative Elements");
        }
        else{
            int n2=in.nextInt();

            if(n1!=n2) System.out.println("Invalid array size");

            else{
                int b[]=new int[n2];
                for(int i=0;i<n2;i++){
                    b[i]=in.nextInt();
                    if(b[i]<0){
                        neg=1;
                        break;
                    }
                }

                if(neg==1){
                    System.out.println("No Negative Elements");
                }
                else{
                    for(int i=0;i<n1;i++){
                        for(int j=0;j<n2;j++){
                            if(a[i]==b[j]){
                                flag=1;
                                System.out.print("("+(i+1)+","+(j+1)+")");
                            }else{
                                continue;
                            }
                        }
                    }
                    if(flag==0){
                        System.out.println("No matching scores");
                    }
                }
            }
        }
    }
}