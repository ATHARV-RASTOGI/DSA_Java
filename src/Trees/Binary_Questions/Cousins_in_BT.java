package Trees.Binary_Questions;

public class Cousins_in_BT {

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx= findNode(root,x);
        TreeNode yy= findNode(root,y);

        return ((level(root,xx,0)==level(root ,yy ,0) && (!issibling(root,xx,yy))));
    }

    TreeNode findNode(TreeNode node, int x){

        if(node==null){
            return null;
        }
        if(node.val ==x){
            return node;
        }
        TreeNode n = findNode(node.left,x);
        if(n!= null){
            return n;
        }
        return findNode(node.right,x);
    }

    boolean issibling(TreeNode node, TreeNode x, TreeNode y){
        if(node==null){
            return false;
        }
        return ((node.left==x && node.right==y) || (node.left ==y && node.right ==x) || issibling(node.left,x,y) || issibling(node.right,x,y));
    }

    int level(TreeNode node ,TreeNode x, int lev){
        if(node==null){
            return 0;
        }
        if(node == x){
            return lev;
        }
        int l= level(node.left,x,lev+1);
        if(l != 0){
            return l;
        }
        return level(node.right,x,lev+1);

    }
}
