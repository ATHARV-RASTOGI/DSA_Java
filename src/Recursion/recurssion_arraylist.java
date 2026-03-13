package Recursion;

import java.util.ArrayList;

public class recurssion_arraylist {
   public static void main(String[] args) {

    ArrayList<Integer> list=new ArrayList<>();
    int []arr={2,4,31,3,6,3,90,31};
    // ArrayList<Integer> ans=findindex(arr, 31, 0,list);
    // System.out.println(ans);
    System.out.println(findindexwithout(arr,31,0));
   } 

   static ArrayList<Integer> findindex(int[]arr, int target,int index,ArrayList<Integer> list){
    if(index==arr.length){
        return list;
    }
    if(arr[index]==target){
        list.add(index);
    }
    return findindex(arr, target, index+1, list);
   }

   static ArrayList<Integer> findindexwithout(int[]arr, int target,int index){
    ArrayList<Integer>list=new ArrayList<>();
    if(index==arr.length){
        return list;
    }
    if(arr[index]==target){
        list.add(index);
    }
    ArrayList<Integer> below =findindexwithout(arr, target, index+1);
    list.addAll(below);
    return list;
    }
}
