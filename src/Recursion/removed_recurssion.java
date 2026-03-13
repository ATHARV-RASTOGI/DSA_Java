package Recursion;

import java.util.ArrayList;

public class removed_recurssion {
    public static void main(String[] args) {
        // subset("","abc");
        System.out.println(subseList("","addba"));
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch =='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    // 
    static String  skip_apple(String up){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("apple")){
            return skip_apple(up.substring(5));
        }
        else{
            return up.charAt(0)+skip_apple(up.substring(1));
        }
    }


    // 
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
             return;
        }
        char ch=up.charAt(0);
        subset(p+ch, up.substring(1));
        subset(p, up.substring(1));

    }

    static ArrayList<String> subseList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left= subseList( p+ch,up.substring(1));
        ArrayList<String>right= subseList( p,up.substring(1));  

        left.addAll(right);
        return left;
    }
}
