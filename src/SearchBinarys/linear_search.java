package Searchings.com;

public class linear_search {
    public static void main(String[] args) {
        int [] num={1,22,45,678,332,53,8,9,-1,3};
        int target=9;
        int ans=linearsearch(num, target);
        System.err.println(ans);

    }
        static int linearsearch(int[]arr ,int target){
            if(arr.length==0){
                return -1;
            }
            for(int index=0;index<arr.length;index++){
                int element=arr[index];
                if(element==target){
                    return index;
                }
            }
            return -1;
        }
    }


