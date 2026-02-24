package DSA_Questions.com;
class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctind=arr[i];
            if(arr[i]!=arr[correctind]){
                swap(arr,i,correctind);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return arr[index];
            }

        }
        return -1;
    }

    static void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}


/* 
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctind=arr[i]-1;
            if(arr[i]!=arr[correctind]){
                swap(arr,i,correctind);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0; index<arr.length ;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);

            }
        }
        return ans;
    }

    static void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }


}*/