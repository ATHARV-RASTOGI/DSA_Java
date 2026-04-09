import java.util.PriorityQueue;

public class Longest_happy_string {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> heap = new PriorityQueue<>( (x, y) -> y[0] - x[0]);

        if(a>0){
            heap.offer(new int[]{a,'a'});
        }
        if(b>0){
            heap.offer(new int[]{b,'b'});
        }
        if(c>0){
            heap.offer(new int[]{c,'c'});
        }

        StringBuilder res= new StringBuilder();

        while(!heap.isEmpty()){
            int curr[]= heap.poll();
            int charcount= curr[0];
            char currchar = (char) curr[1];

            if(res.length()>=2 && res.charAt(res.length() -1) == currchar && res.charAt(res.length() -2) == currchar){

                if(heap.isEmpty()){
                    break;
                }

                int []next= heap.poll();
                int nextcount= next[0];
                char nextchar= (char) next[1];
                res.append(nextchar);
                nextcount--;

                if(nextcount >0 ){
                    heap.offer(new int[]{nextcount,nextchar});
                }

                heap.offer(curr);
            }
            else{
                res.append(currchar);
                charcount--;
                if(charcount >0 ){
                    heap.offer(new int[]{charcount,currchar});
                }
            }
        }

        return res.toString();
    }
}
