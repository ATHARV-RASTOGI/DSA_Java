package DSA_Questions.com;

public class finding_2Digit_even_no {

    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noofdigits=digits(num);
        return noofdigits%2==0;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}

// alternate solution 

// class Solution {
//     public int findNumbers(int[] nums) {
//         int count=0;
//         for(int num:nums){
//             if(even(num)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean even(int num){
//         int noofdigits=convert(num);
//         return noofdigits%2==0;
//     }
//     static int convert(int num){
//         String co=Integer.toString(num);
//         return co.length();
//     }
    

// }
