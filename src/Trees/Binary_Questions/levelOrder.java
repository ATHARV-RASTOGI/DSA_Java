package Trees.Binary_Questions;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result= new ArrayList<>();
    if (root == null){
        return result;
    }

    Queue<TreeNode> queue= new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int levelSize = queue.size();
        List<Integer> currentLevel=new ArrayList<>(levelSize);

        for (int i = 0; i < levelSize; i++) {

            TreeNode currentnode = queue.poll();
            currentLevel.add(currentnode.val);

            if(currentnode.left != null){
                queue.offer(currentnode.left);
            }
            if(currentnode.right!= null){
                queue.offer(currentnode.right);
            }
        }
        result.add(currentLevel);
    }
    return result;
    }
}
