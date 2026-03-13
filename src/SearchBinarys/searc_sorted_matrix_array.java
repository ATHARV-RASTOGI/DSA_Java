package SearchBinarys;

import java.util.Arrays;

class allsearch{

    public int[] binary_searchs(int [][]matrix,int ro,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[ro][mid]==target){
                return new int[]{ro,mid};
            }
            if(target>matrix[ro][mid]){
                cstart=mid+1;
            }
            else{
                cend=mid-1;
            }
        }return new int[]{-1,-1};
    }


    public int[] search(int [][]matrix,int target){
        int row=matrix.length;
        int cols=matrix[0].length;

        if(row==1){
            return binary_searchs(matrix, 0, 0,cols-1, target);
        }
        //for eleminatne the row's
        //upper bounds
        int rStart=0;
        int rend=row-1;
        int cmid=cols/2;

        //loop fro 2 rows 
        while(rStart<(rend-1)){
            int mid=rStart+(rend-rStart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if(matrix[mid][cmid]<target){
                rStart=mid;
            }
            else{
                rend=mid;
            }
        }

        //we have two rows //checking the middle column 

        if (target <= matrix[rStart][cmid - 1]) {
            return binary_searchs(matrix, rStart, 0, cmid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cmid + 1] && target <= matrix[rStart][cols - 1]) {
            return binary_searchs(matrix, rStart, cmid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cmid - 1]) {
            return binary_searchs(matrix, rStart + 1, 0, cmid-1, target);
        } else {
            return binary_searchs(matrix, rStart + 1, cmid + 1, cols - 1, target);
        }
    
    }   
}
public class searc_sorted_matrix_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        allsearch a=new allsearch();
        int[]rea=a.search(arr, 6);
        System.out.println(Arrays.toString(rea));
    }
}






/*
 * 
 * class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[i].length-1;
            for(int j=0;j<matrix[i].length;j++){
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]<target){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                
            }
            
        }
        return false;
    }
}
    
 */