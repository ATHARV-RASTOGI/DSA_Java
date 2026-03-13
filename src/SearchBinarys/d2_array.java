package Searchings.com;

import java.util.Arrays;

public class d2_array {
    public static void main(String[] args) {
        int [][] arr={
            {3,5,72,8},
            {5,7,34},
            {9,6,3,22}
        };
        int target =34;
        int []ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] search (int [][]arr,int target){
        for(int row=0; row< arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
