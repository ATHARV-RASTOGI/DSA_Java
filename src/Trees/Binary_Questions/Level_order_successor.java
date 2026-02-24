package Trees.Binary_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_order_successor {

    private TreeNode levelordersuccessor(TreeNode root,int key){

        List<List<Integer>> result=new ArrayList<>();

        if(root==null){
            return null;
        }

        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>(levelsize);

                TreeNode currnetnode=queue.poll();
                currentlevel.add(currnetnode.val);

                if(currnetnode.left!=null){
                    queue.offer(currnetnode.left);
                }
                if (currnetnode.right == null) {
                    queue.offer(currnetnode.right);

                }
                if(currnetnode.val==key){
                    break;
                }




        }
        return queue.peek();
    }
}
