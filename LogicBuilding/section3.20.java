public class ReverseNumberStarPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= rows - i + 1; j--) {
                System.out.print(j + "*");
            }
            System.out.println();
        }
    }
}
