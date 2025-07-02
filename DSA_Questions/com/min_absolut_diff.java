package DSA_Questions.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class min_absolut_diff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int mi=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            mi=Math.min(mi,arr[i]-arr[i-1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mi){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;

    }

}