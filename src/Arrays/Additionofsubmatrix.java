package Arrays;

import java.util.Scanner;

public class Additionofsubmatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Rows");
        int r=in.nextInt();
        System.out.println("columns");
        int c=in.nextInt();
        System.out.println("Enter the matrix");
        int a[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }

        System.out.println("Enter the start index");
        int r1=in.nextInt();
        int c1=in.nextInt();
        System.out.println("Enter the end index");
        int r2=in.nextInt();
        int c2=in.nextInt();
        int sum=0;

        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++) {
                sum += a[i][j];
            }
        }
        System.out.println("The sum of the required submatrix is: "+sum);
    }
}
