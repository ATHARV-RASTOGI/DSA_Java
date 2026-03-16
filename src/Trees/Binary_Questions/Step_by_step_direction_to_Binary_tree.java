package Trees.Binary_Questions;

public class Step_by_step_direction_to_Binary_tree {

        public TreeNode lowestCommonAncestor(TreeNode root, int  p, int q) {
            if(root == null){
                return null;
            }
            if(root.val==p || root.val == q){
                return root;
            }
            TreeNode left =lowestCommonAncestor(root.left,p,q);
            TreeNode right =lowestCommonAncestor(root.right,p,q);

            if(left != null && right != null){
                return root;
            }

            return left != null ? left : right;

        }

        public String getDirections(TreeNode root, int startValue, int destValue) {
            TreeNode LCA= lowestCommonAncestor(root,startValue,destValue );

            StringBuilder LCAtoStart= new StringBuilder();
            StringBuilder LCAtoDest= new StringBuilder();

            findpath(LCA,startValue,LCAtoStart);
            findpath(LCA,destValue,LCAtoDest);

            StringBuilder result= new StringBuilder();


            for (int i = 0 ;i<LCAtoStart.length();i++){
                result.append('U');
            }
            result.append(LCAtoDest);
            return result.toString();

        }

        public boolean findpath(TreeNode LCA, int target, StringBuilder path){
            if(LCA == null){
                return false;
            }

            if(LCA.val == target){
                return true;
            }

            path.append('L');
            if(findpath(LCA.left,target,path)){
                return true;
            }
            path.deleteCharAt(path.length()-1);

            path.append('R');
            if(findpath(LCA.right,target,path)){
                return true;
            }
            path.deleteCharAt(path.length()-1);

            return false;
        }
}

