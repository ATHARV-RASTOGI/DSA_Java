package DSA_Questions.com;

class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int s=1;
        int e=max(arr);
        while(s<e){
            int ho=0;
            int mid=s+(e-s)/2;
            for(int i=0;i<arr.length;i++){
                 ho+=(arr[i]+ mid-1)/mid;
            }
            if(ho>h){
                s=mid+1;
            }
            else{
                e=mid;
            }
           
        }
        return s;
    }


     static int max(int[] nums){
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        return maxi;
    }
}