package Searchings.com;

import java.util.Arrays;

public class strin_dearch {
    public static void main(String[] args) {
        String name="atharv";
        char target='v';
        search(name, target);

        System.err.println(Arrays.toString(name.toCharArray()));
    }
     static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        // for iteration and cheking 
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}