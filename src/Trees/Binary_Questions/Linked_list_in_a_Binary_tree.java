package Trees.Binary_Questions;


public class Linked_list_in_a_Binary_tree {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null){
            return false;
        }
        return helper(head,root) || isSubPath(head,root.left)|| isSubPath(head,root.right);
    }

    public boolean helper(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.val != head.val){
            return false;
        }
        return helper(head.next,root.left)|| helper(head.next,root.right);
    }
}
