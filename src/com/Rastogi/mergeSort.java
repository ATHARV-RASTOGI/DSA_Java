package com.Rastogi;
import com.Rastogi.Link_list.Node;

public class mergeSort {

    public Node sortedList(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node mid= middleNode(head);
        Node left= sortedList(head);
        Node right = sortedList(mid);

        return mergeTwoLists(left,right);
    }

    public Node mergeTwoLists(Node f, Node s) {

        Node ans = new Node() ; // dummy
        Node head = ans;
        while (f != null && s!= null){
            if(f.value<s.value){
                head.next=f;
                f=f.next;
                head=head.next;
            }
            else{
                head.next=s;
                s=s.next;
                head=head.next;
            }
        }
        if( f!= null){
            head.next=f;
        }else if ( s!= null){
            head.next=s;
        }
        return ans.next;
    }

    public Node middleNode(Node head)
    {
        Node f= head;
        Node s= head;
        while(f != null && f.next!= null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}
