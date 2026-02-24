package Trees;


import interfac.A;

class AVL {

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
        public AVL(){}

        public int height(){
            return height(root);
        }
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
        public Node insert(int value, Node node){

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
            return rotate(node);
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

        private void display(Trees.AVL.Node node, String details){
            if(node==null){
                return;
            }
            System.out.println(details + node.value);
            display(node.left ,"Left child "+ node.value+":");
            display(node.Right ,"Right child "+ node.value+":");
        }

        public Node rotate(Node node){
             if(height(node.left)-height(node.Right)>1){
                 if(height(node.left.left)- height(node.left.Right)>0){
                     return rightrotate(node);
                 }
                 if(height(node.left.left)- height(node.left.Right)<0){
                     //left right case
                     node.left=leftrotate(node.left);
                     return rightrotate(node);
                 }

            }

            if(height(node.left)-height(node.Right)<-1){
                if(height(node.Right.left)- height(node.Right.Right)<0){
                    return leftrotate(node);
                }
                if(height(node.Right.left)- height(node.Right.Right)<0){
                    //left right case
                    node.Right=rightrotate(node.Right);
                    return leftrotate(node);
                }

            }

             return node;
        }

        public Node leftrotate(Node c){
            Node p=c.Right;
            Node t=p.left;

            p.left=c;
            c.Right=t;

            p.height=Math.max(height(p.left),height(p.Right)+1);
            c.height=Math.max(height(c.left),height(c.Right)+1);

            return p;
        }

        public Node rightrotate(Node p ){
            Node c=p.left;
            Node t=c.Right;

            c.Right=p;
            p.left=t;

            p.height=Math.max(height(p.left),height(p.Right)+1);
            c.height=Math.max(height(c.left),height(c.Right)+1);

            return c;

        }

    public static void main(String[] args) {
        System.out.println();
        AVL tree= new AVL();
        for(int i=0; i<100 ; i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
 }

