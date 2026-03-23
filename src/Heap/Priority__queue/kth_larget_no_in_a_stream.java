package Heap.Priority__queue;

import java.util.PriorityQueue;

public class kth_larget_no_in_a_stream
{

        PriorityQueue<Integer> pq;
        public int K;
        public kth_larget_no_in_a_stream(int k, int[] nums) {
            K=k;
            pq=new PriorityQueue<>();

            for(int num:nums){
                pq.offer(num);
                if(pq.size()>K){
                    pq.poll();
                }
            }

        }

        public int add(int val) {
            pq.offer(val);
            if(pq.size()>K){
                pq.poll();
            }

            return pq.peek();
        }
}
