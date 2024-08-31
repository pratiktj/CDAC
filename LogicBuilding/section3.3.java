public class MultiplesOfSeven {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        System.out.println("Multiples of 7 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
