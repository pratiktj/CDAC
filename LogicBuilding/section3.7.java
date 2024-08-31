public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
