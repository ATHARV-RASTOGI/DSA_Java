package Trees.Binary_Questions.Path_sums;


import Trees.Binary_Questions.TreeNode;

public class binary_tree_max_path_sum {
    int ans = Integer.MIN_VALUE;//to inclure nefative root value if only it is there
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left= Math.max(0,left);
        right=Math.max(0,right); // to remove the (-) if it is there .

        int pathsum= left + right +node.val;
        ans= Math.max(ans,pathsum);
        return Math.max(left,right) + node.val;
    }
}
