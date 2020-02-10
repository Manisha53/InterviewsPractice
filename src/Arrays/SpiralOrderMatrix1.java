package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix1 {
    public static void main(String[] args) {
            List<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            ArrayList<Integer> c = new ArrayList<Integer>();
                    a.add(1);
                    a.add(2);
                    a.add(3);
                    b.add(4);
                    b. add(5);
                    b. add(6);
                    c.add(7);
                    c.add(8);
                    c.add(9);
            //{{ 1, 2, 3 },{4, 5, 6 },{ 7, 8, 9 }};
            ar.add(a);
            ar.add(b);
            ar.add(c);
            ArrayList<Integer> res = spiralOrder(ar);
            System.out.println(res);



        }

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int t=0;
        int m=A.size();  //breadth /vertical
        int n=A.get(0).size(); //length /horizontal
        int b=m-1;
        int dir=0;        /*right=1,down=2,left=3,up=0*/
        int l=0;
        int r=n-1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(l<=r && t<=b){
            if(dir==0){
                for(int i=l;i<=r;i++){
                    //System.out.print(A.get(t).get(i)+" ");
                    ans.add(A.get(t).get(i));
                }
                dir=1;
                t++;
            }
            else if(dir==1){
                for(int i=t;i<=b;i++){
                    //System.out.print(A.get(i).get(r)+" ");
                    ans.add(A.get(i).get(r));
                }
                dir=2;
                r--;
            }
            else if(dir==2){
                for(int i=r;i>=l;i--){
                    //System.out.print(A.get(b).get(i)+" ");
                    ans.add(A.get(b).get(i));
                }
                dir=3;
                b--;
            }
            else if(dir==3){
                for(int i=b;i>=t;i--){
                    //System.out.print(A.get(i).get(l)+" ");
                    ans.add(A.get(i).get(l));
                }
                dir=0;
                l++;
            }

        }


        return ans;
    }
}
