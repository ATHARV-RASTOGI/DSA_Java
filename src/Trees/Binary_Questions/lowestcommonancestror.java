package Trees.Binary_Questions;

public class lowestcommonancestror {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root == p  || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        return left == null ? right :left;
    }

    public int ksmallest(TreeNode root, int k){
        return helperss(root,k).val;
    }

    int count=0;
    public TreeNode helperss(TreeNode root ,int k){
        if(root == null){
         return null;
        }
        TreeNode left = helperss(root.left,k);

        if(left!=null){
            return left;
        }
        count ++;

        if(count==k){
            return root;
        }
        return helperss(root.right,k);

    }
}
