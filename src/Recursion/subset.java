package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

    static List<List<Integer>> subsetDub(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        bac(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void bac(int []candidates,int target,int start ,List<Integer> temp, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<candidates.length;i++){

            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i]>target)break;
            temp.add(candidates[i]);
            bac(candidates,target-candidates[i],i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}