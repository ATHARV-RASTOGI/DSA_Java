package Trees.Binary_Questions;

import com.sun.source.tree.Tree;

import java.util.*;

public class Zig_zag {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>>result= new ArrayList<>();

        if(root==null){
            return result;
        }

        Deque<TreeNode> dequq=new LinkedList<>();
        dequq.add(root);
        boolean reverse=false;

        while (!dequq.isEmpty()){
            int levelsize= dequq.size();
            List<Integer> cul=new ArrayList<>(levelsize);

            for (int i = 0; i < levelsize; i++) {

                if(!reverse){
                    TreeNode cu_node= dequq.pollFirst();
                    cul.add(cu_node.val);

                    if(cu_node.left!=null){
                        dequq.addLast(cu_node.left);
                    }
                    if(cu_node.right!=null){
                        dequq.addLast(cu_node.right);
                    }                }
                else{
                    TreeNode cu_node= dequq.pollLast();
                    cul.add(cu_node.val);

                    if(cu_node.right!=null){
                        dequq.addFirst(cu_node.right);
                    }
                    if(cu_node.left!=null){
                        dequq.addFirst(cu_node.left);
                    }

                }
            }
            result.add(cul);
            reverse= !reverse;
        }
        return result;
    }
}
