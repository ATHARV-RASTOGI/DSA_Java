package DSA_Questions.com;

public class ship_package_within_d_days {
    public static void main(String[] args) {
        Solution s= new Solution() ;
        int[]arr={1,2,3,1,1};
        int res=s.shipWithinDays(arr, 4);
        System.out.println(res);
     }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int s = 0;
        int end = 0;
        for (int num : weights) {
            s = Math.max(s, num);
            end += num;
        }
        
        while(s<end){
            int mid=s+(end-s)/2;
            int reqdays=countdays(weights ,mid);

            if(reqdays > days){
                s=mid+1;
            }
            else{
                end=mid;
            }
        }
        return s;
    }

        static int countdays(int []weight,int mid){
            int day=1;
            int total=0;

            for(int w : weight){
                if(total+w >mid){
                    day++;
                    total=0;
                }
                total+=w;
            }
            return day;
        }
}