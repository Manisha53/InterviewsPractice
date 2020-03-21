package Accenture;


import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class StringConcate{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name=in.nextLine();
        name=name.toUpperCase();

        System.out.println("Inmate's father's name:");
        String father=in.nextLine();
        father=father.toUpperCase();

        Pattern p=Pattern.compile("[^A-Za-z\\s]");
        Matcher m=p.matcher(name.concat(" "+father));
        boolean b=m.find();

        if(b){
            System.out.println("Invalid name");
        }
        else{
            System.out.println(name.concat(" "+ father));
        }
    }
}