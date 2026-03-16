package Trees.Binary_Questions;

import java.util.ArrayList;
import java.util.List;

public class Pre_Post_Inorder_traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        helper(root,list);
        return list;

    }
    void helper(TreeNode node, List<Integer> list){
        if(node==null){
            return  ;
        }
        list.add(node.val);
        helper(node.left,list);
        helper(node.right,list);
    }
    void helper_post(TreeNode node, List<Integer> list){
        if(node==null){
            return  ;
        }

        helper(node.left,list);
        helper(node.right,list);
        list.add(node.val);
    }
    void helper_inorder(TreeNode node, List<Integer> list){
        if(node==null){
            return  ;
        }

        helper(node.left,list);
        list.add(node.val);
        helper(node.right,list);

    }
}
