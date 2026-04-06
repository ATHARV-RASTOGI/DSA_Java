package Heap.Priority__queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_k_element_in_a_array
{
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequency= new HashMap<>();

        for(int n : nums){
            frequency.put(n,frequency.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> sort= new PriorityQueue<>((a, b) -> Integer.compare(frequency.get(a) , frequency.get(b)));

        for(int nu: frequency.keySet()){
            sort.add(nu);
            if(sort.size()>k) sort.poll();
        }

        int [] res= new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sort.poll();
        }
        return res;
    }
}
