package Heap.Priority__queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ksmallestpair {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> heap = new PriorityQueue<>( (a, b) -> (a[0]+a[1]) - (b[0]+b[1]) );
        List<List<Integer>> res= new ArrayList<>();

        for(int i = 0 ; i <nums1.length && i<k ; i++){
            heap.add(new int[]{nums1[i], nums2[0], 0});

        }

        for(int i = 0 ; i<k && !heap.isEmpty() ; i++){
            int curr[]= heap.poll();
            int u=curr[0];
            int v= curr[1];
            int index= curr[2];

            res.add(Arrays.asList(u,v));

            if(index + 1 < nums2.length){
                heap.add(new int[]{u, nums2[index + 1], index + 1});
            }
        }
        return res;

    }
}
