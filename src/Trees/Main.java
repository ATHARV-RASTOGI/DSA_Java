package Trees;

public class Main {
    public static void main(String[] args) {
        AVL trees = new AVL();
        for (int i = 0; i < 100; i++) {
            trees.insert(i);

        }
        System.out.println(trees.height());
    }
}
