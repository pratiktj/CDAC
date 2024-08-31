public class FibonacciSequence {
    public static void main(String[] args) {
        int limit = 21;
        int a = 0, b = 1;

        System.out.print("Fibonacci sequence up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
