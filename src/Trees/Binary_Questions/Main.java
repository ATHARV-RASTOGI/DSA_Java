package Trees.Binary_Questions;

class Main {
    public static void main(String[] args) {
//        TreeNode root= new TreeNode(1,new TreeNode(2),new TreeNode(3));
//        Solution sol=new Solution();
//        System.out.println(sol.levelOrder(root));
//
//        Averagelevels av= new Averagelevels();
//        Level_order_successor lv=new Level_order_successor();
//        TreeNode root = new TreeNode(1);
//
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);
//
//        Symmetric_tree t = new Symmetric_tree();
//        System.out.println(t.isSymmetric(root));


        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Cousins_in_BT obj = new Cousins_in_BT();

        boolean result = obj.isCousins(root, 4, 5);

        System.out.println(result);

    }
}
