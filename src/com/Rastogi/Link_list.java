package com.Rastogi;

import javax.xml.stream.events.NotationDeclaration;

public class Link_list {


    private Node head;
    private Node tail;
    private int size;

    public Link_list() {
        this.size = 0;
    }

    public static class Node {

        int value;
        Node next;

        //by default constructor
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }


    public void insertFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertlast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertlast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deletefirst() {

        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deletlast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int deleteindex(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletlast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node findnode(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void dispaly() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //INsert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }




    //recurssion reverse
    private Node reverse(Node node) {
        if (node == tail) {
            head = tail;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
        return node;
    }


    public Node duplicates_remove(Node head) {
        Node node = head;
        Node temp = head;
        if (node == null) {
            return node;
        }
        while (temp.next != null) {

            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return node;
    }

    public static Link_list Merge(Link_list first, Link_list second) {
        Node f = first.head;
        Node s = second.head;

        Link_list ans = new Link_list();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertlast(f.value);
                f = f.next;
            } else {
                ans.insertlast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertlast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertlast(s.value);
            s = s.next;
        }
        return ans;
    }

    public boolean Linked_cycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //to count the length inside the list-cycle
    public int Count_elements(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int len = 0;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);
                return len;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = Count_elements(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }
//       find the start
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving both forward
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));

        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;

    }

    private int findsquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    //            fast and slow pointer method
//            here f has twice the speed of s so buy the time f
//            reaces the end the s will only be abel to arrive
//            at half the list i.e in the middle hence we get our
//            middle of hte list
    public Node middleNode(Node head) {
        Node f = head;
        Node s = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) return null;
        Node dummy= new Node(0);
        dummy.next=head;
        Node p=dummy;
        Node f= head;
        Node s= head;
        while(f!=null && f.next != null){
            p=p.next;
            s=s.next;
            f=f.next.next;

        }
        p.next=s.next;
        return dummy.next;
    }

    //in-placer reversal
    public Node reverse_inplace(Node head) {

        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
//            head = prev;
        }
        return prev;

    }

    public Node reversePart(Node head, int left, int right) {
        if (left == right) {
            return head;
        }
        //
        Node cur = head;
        Node prev = null;

        for (int i = 0; cur != null && i < left - 1; i++) {
            prev = cur;
            cur = cur.next;
        }

        Node last = prev;
        Node newEnd = cur;
        Node next = cur.next;

        for (int i = 0; cur != null && i < right - left + 1; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = cur;
        return head;
    }

    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node comphead = reverse_inplace(mid);
        Node rereversehead = comphead;

        while (head != null && comphead != null) {
            if (head.value != comphead.value) {
                break;
            }
            head = head.next;
            comphead = comphead.next;
        }
        reverse_inplace(rereversehead);
        return head == null || comphead == null;
    }

    public void reorderesdlist(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node hf = head;
        Node mid = middleNode(hf);
        Node hs = reverse_inplace(mid);

        // rearrange
        while (hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if (hf != null) {
            hf.next = null;
        }

    }

    public Node reverseKGroup(Node head, int k) {
        if (k < 1 || head == null) {
            return head;
        }
        //
        Node cur = head;
        Node prev = null;

        while (true) {

            Node checker = cur;
            for (int i = 0; i < k; i++) {
                if (checker == null) {
                    return head;
                }
                checker = checker.next;
            }

            Node last = prev;
            Node newEnd = cur;
            Node next = cur.next;

            for (int i = 0; cur != null && i < k; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = cur;
            if (cur == null) {
                break;
            }
            prev = newEnd;
        }
        return head;

    }

    public Node rotateright(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
        Node p_a = headA;
        Node p_b = headB;
        while (p_a != p_b) {
            if (p_a == null) {
                p_a = headB;
            } else {
                p_a = p_a.next;
            }

            if (p_b == null) {
                p_b = headA;
            } else {
                p_b = p_b.next;
            }
        }
        return p_a;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;


        // ListNode f1=re_reverse(l1);
        // ListNode f2= re_reverse(l2);

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum= carry;

            if(l1!= null){
                sum = sum+ l1.value;
                l1=l1.next;
            }
            if(l2 != null){
                sum=sum+l2.value;
                l2=l2.next;
            }
            carry=sum/10;
            current.next = new Node(sum % 10);
            current=current.next;

        }
        return dummy.next;

    }
    public Node partition(Node head, int x) {
        Node befor= new Node(0);
        Node head_bef= befor;
        Node after= new Node (0);
        Node head_af = after;

        while(head != null){
            if(head.value<x){
                head_bef.next=head;
                head_bef=head_bef.next;

            }else{
                head_af.next= head;
                head_af=head_af.next;
            }
            head=head.next;
        }


        head_af.next=null;
        head_bef.next=after.next;
        return befor.next;
    }
    public Node oddEvenList(Node head) {
        if(head == null){
            return head;
        }
        Node odd= head;
        Node even= odd.next;
        Node evenhead= even;
        while(even !=null && even.next!=null ){
            odd.next=even.next;
            odd=odd.next;
            even.next= odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

    public Node removeElements(Node head, int value) {

        while (head != null && head.value == value) {
            head = head.next;
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public Node removeNthFromEnd(Node head, int n) {

        if(head==null){
            return null;
        }

        Node first= head;
        Node second= head;

        for(int i=0 ; i<n ;i++){
            first=first.next;
        }
        if (first == null) {
            return head.next;
        }
        while(first.next!= null){
            first=first.next;
            second=second.next;
        }
        second.next= second.next.next;
        return head;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int nums = nums1[i];
            int indexInNums2 = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums) {
                    indexInNums2 = j;
                    break;
                }
            }


            int nextg = -1;
            for (int j = indexInNums2 + 1; j < nums2.length; j++) {
                if (nums2[j] > nums) {
                    nextg = nums2[j];
                    break;
                }
            }

            res[i] = nextg;
        }

        return res;
    }

    public Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;


        while (prev.next != null && prev.next.next != null) {
            Node pres = prev.next;
            Node curr = prev.next.next;

            pres.next = curr.next;
            curr.next = pres;
            prev.next = curr;

            prev = pres;

        }
        return dummy.next;
    }
}