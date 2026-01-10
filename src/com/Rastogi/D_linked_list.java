package com.Rastogi;

public class D_linked_list
{

    private Node head;
    Node tail;
    int size;

    public void insert(int after,int val){
        Node p= findnode(after);

        if(p==null){
            System.out.println("Not exists");
            return;
        }

        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }

    }

    public Node findnode(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        //just updating the values
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.value+" "+"-> ");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public void insertlast(int value){
        Node node=new Node(value);
        Node temp=head;
        node.next=null;

        if(head==null){
            node.prev=null;
            head=null;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        node.prev=temp;

    }

//    public void display_rev(){
//        Node node=head;
//    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
