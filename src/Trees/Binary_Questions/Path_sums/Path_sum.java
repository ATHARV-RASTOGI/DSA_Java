package Trees.Binary_Questions.Path_sums;

import Trees.Binary_Questions.TreeNode;

public class Path_sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if(root.val == targetSum && root.left== null && root.right== null ){
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right , targetSum-root.val);
    }
}
