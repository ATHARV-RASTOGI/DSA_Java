package Trees.Binary_Questions;

class Main {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1,new TreeNode(2),new TreeNode(3));
        Solution sol=new Solution();
        System.out.println(sol.levelOrder(root));

        Averagelevels av= new Averagelevels();
        Level_order_successor lv=new Level_order_successor();
        
    }
}
