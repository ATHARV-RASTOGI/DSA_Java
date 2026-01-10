package Stack_queue.Stack_queue_question;

import java.util.Stack;

public class Stack_queation {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();

    }
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
    }
}
