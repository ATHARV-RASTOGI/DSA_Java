package Trees;

import java.util.Scanner;

public class BST {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        BST tree=  new BST();
        int []nums={90,67,91,3,29,9,50,40};
        tree.populate(nums);
        tree.display();
    }


    public class Node {
        private int value;
        private Node left;
        private Node Right;
        private int height;

        public Node(int value){
            this.value=value;
        }

        public int getValue() {
            return value;
        }


    }

    public Node root;
    public BST(){}

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(this.root,"Root Node:");
    }

    public void insert(int value){
        root= insert(value,root);
    }
    public Node insert(int value,Node node){

        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);

        }if(value>node.value){
            node.Right=insert(value,node.Right);
        }

        node.height=Math.max(height(node.left),height(node.Right))+1;
        return node;
    }

    public void populate(int []nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.Right))<=1 && balanced(node.left) && balanced(node.Right);

    }

    private void display( Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left ,"Left child "+ node.value+":");
        display(node.Right ,"Right child "+ node.value+":");
    }

}
