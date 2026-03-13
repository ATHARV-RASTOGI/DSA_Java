package SearchBinarys;

class der{

    public int  searched(int []nums,int x){
        int start=0;
        int end=nums.length-1;
        int target=x;
      

        if(target>nums[end]){
          return -1;  
        }

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
        return start;
    };
}

public class celi_of_no {
    public static void main(String[] args) {
        int []arr={1,21,23,44,46,66,78,89};
        //int []arr2={89,78,66,44,23,21,1};
        int x=60;
        der s=new der();
        int res =s.searched(arr, x);
        System.out.println(res);
        if (res==-1){
            System.out.println("no ceclling");
        }
        else{
            System.out.println("celling is present");
        }
    }
}