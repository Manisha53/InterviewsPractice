package Accenture;

import java.util.*;

class Siblings_Fund{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of boxes sold by Sara");
        int s=in.nextInt();
        System.out.println("Enter the number of boxes sold by Harry");
        int h=in.nextInt();
        System.out.println("Enter the number of boxes sold by Leo");
        int l=in.nextInt();
        System.out.println("Enter the number of boxes sold by James");
        int j=in.nextInt();

        int max = Math.max(s,Math.max(h,Math.max(l,j)));

        ArrayList<Integer> list = new ArrayList<>();
        if(s==max){
            list.add(0);
        }
        if(h==max){
            list.add(1);
        }
        if(l==max){
            list.add(2);
        }
        if(j==max){
            list.add(3);
        }
        if(list.size() == 4){
            System.out.println("All get the same gifts.");
        }else if(list.size() == 1){
            System.out.println(getName(list.get(0))+" receives the gifts.");
        }else{
            StringBuilder name = new StringBuilder();
            int i;
            for(i=0; i< list.size()-1; i++){
                name.append(getName(list.get(i))).append(", ");
            }
            String str = name.substring(0, name.length()-2);
            str+= " and "+getName(list.get(i))+" receive the gifts.";
            System.out.println(str);
        }

    }

    public static String getName(int num){
        String name = "";
        switch (num){
            case 0: name = "Sara"; break;
            case 1: name = "Harry"; break;
            case 2: name = "Leo"; break;
            default: name = "James"; break;
        }
        return name;
    }
}