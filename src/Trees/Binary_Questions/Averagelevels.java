package Trees.Binary_Questions;

import java.util.*;

public class Averagelevels {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double>result= new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize= queue.size();
            double avg= 0;
            for (int i = 0; i < levelsize; i++) {
                TreeNode currnet= queue.poll();
                avg += currnet.val;
                if(currnet.left!=null){
                    queue.offer(currnet.left);
                }
                if(currnet.right!=null){
                    queue.offer(currnet.right);
                }
            }
            avg=avg/levelsize;
            result.add(avg);
        }
        return result;

    }
}
