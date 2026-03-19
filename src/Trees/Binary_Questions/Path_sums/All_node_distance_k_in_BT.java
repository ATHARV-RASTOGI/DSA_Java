package Trees.Binary_Questions.Path_sums;

import Trees.Binary_Questions.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class All_node_distance_k_in_BT {

        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            List<Integer> result= new ArrayList<>();
            List<TreeNode> path= new ArrayList<>();


            findpath(root, target,k,path);
            for(int i=0;i<path.size();i++){
                TreeNode node = path.get(i);
                TreeNode blocker = (i == 0) ? null : path.get(i - 1);
                collect(node,k - i,result, blocker);

            }
            return result;
        }

        public boolean findpath(TreeNode node, TreeNode target , int k,List<TreeNode> path){
            if(node == null){
                return false;
            }
            if(node == target || findpath(node.left,target,k,path) || findpath(node.right,target,k,path)){
                path.add(node);
                return true;

            }
            return false;
        }

        public void collect(TreeNode root,int k, List<Integer> result,TreeNode blocker){
            if(root == null || k<0 || root == blocker){return;}

            if(k==0){
                result.add(root.val);
                return;
            }
            collect(root.left,k-1,result,blocker);
            collect(root.right,k-1,result,blocker);
        }
}
