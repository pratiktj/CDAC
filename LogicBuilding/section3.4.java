public class ReverseDigits {
    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
