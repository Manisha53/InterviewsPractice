package Accenture;

public class Bhaiya {
    public static void main(String[] args) {
        printPrime(130, 212);
        printPrime(131, 212);
        printPrime(3, 13);
        printPrime(10, 100);
    }

    private static void printPrime(int n1, int n2) {
        if(n1%10 != 1){
            if(n1%10 != 0) {
                n1 = (n1 / 10) * 10 + 11;
            }else {
                n1++;
            }
        }

        if(n2%10 != 1){
            if(n2%10 != 0) {
                n2 = (n2 / 10) * 10 + 11;
            }else {
                n2++;
            }
        }

        for(int i=n1; i <= n2; i= i+10){
            if(prime(i)){
                if(i == n2){
                    System.out.print(i);
                }else {
                    System.out.print(i + ",");
                }
            }
        }
        if (!prime(n2)) {
            while (!prime(n2)){
                n2 += 10;
            }
            System.out.println(n2);
        }
    }

    public static boolean prime(int x){
        boolean flag=true;
        if(x<=0 ||x==1 ){
            flag=false;
        }
        else if(x==2){
            flag=true;
        }
        else{
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    flag=false;
                    break;
                }

            }
        }
        return flag;
    }
}
