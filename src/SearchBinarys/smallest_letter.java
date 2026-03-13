package SearchBinarys;


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return letters[start % letters.length ];
        /*if (start == letters.length) {
            return letters[1];
        } else {
        return letters[0];
      } */  
    }
}

public class smallest_letter {
    public static void main(String[] args) {
        char[]arr={'c','h','i','j'};
        //int []arr2={89,78,66,44,23,21,1};
        char x ='e';
        Solution s=new Solution ();
        char re=s.nextGreatestLetter(arr,x);
        System.out.println(re);
    }
}
