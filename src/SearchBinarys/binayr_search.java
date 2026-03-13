package SearchBinarys;

class search{

    public int  searched(int []nums,int x){
        int start=0;
        int end=nums.length-1;
        int target=x;

        while(start<=end){
        int mid=(start+end)/2;
        
        if(target==nums[mid]){
            return mid;
        }
        else if (target<nums[mid]){//(target>nums[mid]) for descending
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       
         }
        return -1;
    };
}

public class binayr_search {
    public static void main(String[] args) {
        int []arrt=new int[0];
        int []arr={1,21,23,44,66,78,89};
        //int []arr2={89,78,66,44,23,21,1};
        int x=89;
        search s=new search();
        int res =s.searched(arr, x);
        if (res ==-1){
            System.out.println("not");
        }
        else{
            System.out.println("Found");
        }
    }
}
