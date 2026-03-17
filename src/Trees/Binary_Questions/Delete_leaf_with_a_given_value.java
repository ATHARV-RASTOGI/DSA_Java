package Trees.Binary_Questions;

public class Delete_leaf_with_a_given_value {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        root.left = removeLeafNodes(root.left,target);
        root.right= removeLeafNodes(root.right,target);

        if(root.val == target && root.left== null && root.right== null){
            return null;
        }

        return root;
    }
}
