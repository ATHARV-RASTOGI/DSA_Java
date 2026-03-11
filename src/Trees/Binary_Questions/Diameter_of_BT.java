package Trees.Binary_Questions;

public class Diameter_of_BT {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return diameter;
    }

    int height(TreeNode node){

        if(node== null){return 0;}

        int leftnode= height(node.left);
        int rightnode= height(node.right);


        diameter= Math.max(diameter,leftnode+rightnode);

        return Math.max(leftnode,rightnode)+1;
    }
}
