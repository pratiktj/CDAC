public class NumberPattern {
    public static void main(String[] args) {
        int[] pattern = {2, 3, 4, 5, 5, 4, 3, 2};

        for (int num : pattern) {
            for (int i = 0; i < num; i++) {
                System.out.print(num);
                if (i < num - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
