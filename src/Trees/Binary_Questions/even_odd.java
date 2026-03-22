package Trees.Binary_Questions;

import java.util.LinkedList;
import java.util.Queue;

public class even_odd {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        boolean even_level=true;

        while(!queue.isEmpty()){
            int n= queue.size();

            int prev;
            if(even_level){
                prev=Integer.MIN_VALUE;
            }
            else{
                prev=Integer.MAX_VALUE;
            }
            for(int i=0;i<n;i++){
                TreeNode curr=queue.poll();

                if(even_level && (curr.val %2 ==0 || curr.val<= prev)){
                    return false;
                }
                if(!even_level && (curr.val %2 !=0 || curr.val>= prev)){
                    return false;
                }
                prev=curr.val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }

            }
            even_level=!even_level;
        }
        return true;
    }
}
