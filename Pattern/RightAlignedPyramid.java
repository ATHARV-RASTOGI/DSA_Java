public class RightAlignedPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int l = 1; l <= n - i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
