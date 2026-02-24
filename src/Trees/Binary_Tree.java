package Trees;

import java.util.Scanner;

class Binary_Tree {
    public Binary_Tree(){};

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }

    }

    private Node root;


    //insert value-binary tree;

    public void populate(Scanner scanner){
        System.out.println("Enter the root value");
        int value = scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the left of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of this node "+ node.value);
            int value = scanner.nextInt();
            node.left= new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter the right of "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of this node "+ node.value);
            int value = scanner.nextInt();
            node.right= new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root," ");
    }
    private void display(Node node, String s){
        if(node == null){
            return;
        }
        System.out.println(s + node.value);
        display(node.left , s + "\t");
        display(node.right, s +"\t");
    }

    public void preorder(){
        preorder(root);
    }
    public void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);

    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(Node node){
        if(node==null){
            return;
        }

        preorder(node.left);
        System.out.println(node.value + " ");
        preorder(node.right);

    }
    public void postorder(){
        postorder(root);
    }
    public void postorder(Node node){
        if(node==null){
            return;
        }

        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value + " ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binary_Tree tree=  new Binary_Tree();
        tree.populate(scanner);
        tree.display();
    }


}
