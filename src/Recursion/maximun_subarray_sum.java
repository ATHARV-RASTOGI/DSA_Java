package Recursion;

public class maximun_subarray_sum {
    public static void main(String[] args) {
        Solution s= new Solution() ;
        int[]arr={5,-2,3,-4,9,-3,-1,8,6,1};
        int res=s.maxSubArray(arr);
        System.out.println(res);
     }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            if(max<curr_sum){
                max=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max;
    }
}