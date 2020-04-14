//MY WAY ,NOT PASSED ALL TESTCASES
/*Sample input 1

mango basket ball auspicious kangaroo

precaution misbehavior battery cup screen

parasite hello good come education

invitation squeeze paper ant multiplication

COOPERATION DEMOCRACY CONGRATULATIONS YOU BYE

Sample output 1

1 1 0 8 4

6 6 1 0 1

4 1 1 1 6

6 4 1 0 8

8 3 8 1 0

1 14

2 14

3 13

4 19

5 20

The winner is student 5 with points 20
*/
    1 import java.util.*;
    2 import java.lang.*;
    3 
    4 class Main{
    5     
    6     public static int countvowel(String s){
    7         int count=0;
    8         s=s.toLowerCase();
    9         for(int i=0;i<s.length();i++){
   10             char ch=s.charAt(i);
   11             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
   12                 count++;
   13             }
   14         }
   15         return count;
   16     }
   17     
   18     public static void main (String[] args) {
   19         Scanner in=new Scanner(System.in);
   20         String a[][]=new String[5][5];
   21         int vowel_count[][]=new int[5][5];
   22         for(int i=0;i<5;i++){
   23             for(int j=0;j<5;j++){
   24                 a[i][j]=in.next();
   25             }
   26         }
   27         
   28         for(int i=0;i<5;i++){
   29             for(int j=0;j<5;j++){
   30                 vowel_count[i][j]=countvowel(a[i][j]);
   31                 switch(vowel_count[i][j]){
   32                     case 1: vowel_count[i][j]=0;
   33                     break;
   34                     case 2:vowel_count[i][j]=1;
   35                     break;
   36                     case 3:vowel_count[i][j]=3;
   37                     break;
   38                     case 4:vowel_count[i][j]=4;
   39                     break;
   40                     case 5:vowel_count[i][j]=6;
   41                     break;
   42                     default:vowel_count[i][j]=8;
   43                     break;
   44                     
   45                 }
   46                 
   47             }
   48         }
   49         
   50         int sum[]=new int[5];
   51         //int sort_sum[]=new int[5];
   52         
   53         for(int i=0;i<5;i++){
   54             for(int j=0;j<5;j++){
   55                 System.out.print(vowel_count[i][j]+"\t");
   56             }
   57             System.out.println();
   58         }
   59         
   60         for(int i=0;i<5;i++){
   61             int j=0;
   62             sum[i]=0;
   63             while(j<5){
   64                 sum[i]+=vowel_count[i][j++];
   65             }
   66         }
   67         
   68         int max = Integer.MIN_VALUE;
   69         HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
   70         for(int i=0;i<5;i++){
   71            // sort_sum[i]=sum[i];
   72             System.out.println((i+1)+"\t"+sum[i]);
   73             ArrayList<Integer> val = hm.getOrDefault(sum[i], new ArrayList<>());
   74             val.add(i+1);
   75             hm.put(sum[i], val);
   76             max = Math.max(sum[i], max);
   77         }
   78         if(max == 0){
   79             System.out.println("No one has got any points");
   80             return;
   81         }
   82         
   83         ArrayList<Integer> res = hm.get(max);
   84         if(res.size() == 1){
   85             System.out.println("The winner is student "+res.get(0)+" with points "+max);
   86             return;
   87         }
   88         Collections.sort(res);
   89         StringBuffer str = new StringBuffer();
   90         for(int x: res){
   91             str.append("student ").append(x).append(" ");
   92         }
   93         
   94         System.out.println("The winner is "+str.toString()+"with points "+max);
   95         
   96         
   97         
   98   
   99     }
  100 }
