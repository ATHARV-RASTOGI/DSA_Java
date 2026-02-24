package Stack_queue.Stack_queue_question;

import java.util.PriorityQueue;

public class Queue_question {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        for(int num : nums){
            queue.add(num);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
