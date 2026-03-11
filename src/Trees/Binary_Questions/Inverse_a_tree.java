package Trees.Binary_Questions;

public class Inverse_a_tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public int maxDepth(TreeNode root) {
        return height(root);

    }
    int height(TreeNode node){

        if(node== null){
            return 0;
        }
        int leftcal=height(node.left);
        int rightcal= height(node.right);

        return Math.max(leftcal,rightcal)+1;

    }

//    public int maxDepth(TreeNode root) {
//        if(root== null){
//            return 0;
//        }
//        int leftcal=maxDepth(root.left);
//        int rightcal= maxDepth(root.right);
//
//        return Math.max(leftcal,rightcal)+1;
//    }
}
