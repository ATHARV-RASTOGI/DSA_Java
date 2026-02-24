package Stack_queue.Stack_queue_question;

import java.util.PriorityQueue;
import java.util.Stack;

public class Stack_queation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

    }

    class Queueusingstack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public Queueusingstack() {
            first = new Stack<>();
            second = new Stack<>();

        }

        public void push(int item) {
            first.push(item);
        }

        public int pop() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int removed = second.pop();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() throws Exception {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int peeked = second.peek();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return peeked;
        }

        public boolean Empty() {
            return first.isEmpty();
        }
    }

    class Remove_efficient_Queueusingstack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public Remove_efficient_Queueusingstack() {
            first = new Stack<>();
            second = new Stack<>();

        }

        public void push(int item) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            first.push(item);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }

        }

        public int pop() {
            return first.pop();
        }

        public int peek() throws Exception {
            return first.peek();
        }

        public boolean Empty() {
            return first.isEmpty();
        }
    }

    class MyStack {
        private Stack<Integer> first;
        private Stack<Integer> second;


        public MyStack() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void push(int item) {
            first.push(item);
        }

        public int pop() {

            if (empty()) throw new IllegalStateException();
            return first.pop();
        }

        public int top() {
            if (empty()) throw new IllegalStateException("Stack is empty");
            return first.peek();
        }

        public boolean empty() {
            return first.isEmpty();
        }
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
            if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }

            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int astro : asteroids) {
            if (astro > 0) {
                stack.push(astro);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() < Math.abs(astro)) {
                        stack.pop();
                    } else if (stack.peek() == Math.abs(astro)) {
                        stack.pop();
                        astro = 0;
                        break;
                    } else {
                        astro = 0;
                        break;
                    }
                }
                if (astro != 0) {
                    stack.push(astro);
                }
            }

        }
        int res[] = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int nge[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    nge[i] = stack.peek();
                } else {
                    nge[i] = -1;
                }
            }
            stack.push(nums[i % n]);
        }
        return nge;

    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    class findsumsubarraymin {

//        public int sumSubarrayMins(int[] arr) {
//        int sum = 0;
//        int mod = (int)(1e9 + 7);
//
//        for(int i = 0; i < arr.length; i++) {
//            int min = arr[i];
//            for(int j = i; j < arr.length; j++) {
//                min = Math.min(min, arr[j]);  // Compare with arr[j], not arr[i]
//                sum = (sum + min) % mod;
//            }
//        }
//        return sum;
//    }
        
        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;

            int[] NSL = getNSL(arr, n);
            int[] NSR = getNSR(arr, n);

            long sum = 0;

            long m = 1000000007;

            for (int i = 0; i < n; i++) {
                long ls = i - NSL[i];
                long rs = NSR[i] - i;
                long total = ls * rs;
                long totalsum = total * arr[i];
                sum = (sum + totalsum) % m;
            }
            return (int) sum;
        }
// Previous smallest number


        public int[] getNSL(int[] arr, int n) {
            int[] res = new int[n];

            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {

                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek();
                }
                st.push(i);
            }
            return res;
        }
//        Next smallest number
        public int[] getNSR(int[] arr, int n) {
            int[] res = new int[n];

            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();

                }
                if (st.isEmpty()) {
                    res[i] = n;
                } else {
                    res[i] = st.peek();
                }
                st.push(i);
            }
            return res;
        }
    }

    public int operate(int b ,int a, String s){
        if(s.equals("+")){
            return b+a;
        }
        if(s.equals("-")){
            return b-a;
        }
        if(s.equals("*")){
            return b*a;
        }
        if(s.equals("/")){
            return b/a;
        }
        return -1;

    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();

        for(String s : tokens){
            if(s.equals("+") ||s.equals("-")||s.equals("*")||s.equals("/") ){
                int a = st.pop();
                int b = st.pop();

                int result=operate(b,a,s);
                st.push(result);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
