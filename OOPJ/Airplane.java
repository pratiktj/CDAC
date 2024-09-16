package assignment6;
import java.util.Scanner;

public class Airplane {
  
	private char[][] seats;
    private int rows;
    private int cols;

    
    public Airplane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; // 'A' stands for Available
            }
        }
    }

    
    public void bookSeat(int row, int col) {
        if (seats[row][col] == 'A') {
            seats[row][col] = 'O'; // 'O' stands for Occupied
            System.out.println("Seat booked successfully.");
        } else {
            System.out.println("Seat is already occupied.");
        }
    }

   
    public void cancelBooking(int row, int col) {
        if (seats[row][col] == 'O') {
            seats[row][col] = 'A';
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Seat is already available.");
        }
    }

    
    public boolean isSeatAvailable(int row, int col) {
        return seats[row][col] == 'A';
    }

    
    public void displaySeatingChart() {
        System.out.println("Current Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        Airplane airplaneSeating = new Airplane(rows, cols);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Check seat availability");
            System.out.println("4. Display seating chart");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number to book: ");
                    int bookRow = scanner.nextInt();
                    System.out.print("Enter column number to book: ");
                    int bookCol = scanner.nextInt();
                    airplaneSeating.bookSeat(bookRow, bookCol);
                    break;
                case 2:
                    System.out.print("Enter row number to cancel: ");
                    int cancelRow = scanner.nextInt();
                    System.out.print("Enter column number to cancel: ");
                    int cancelCol = scanner.nextInt();
                    airplaneSeating.cancelBooking(cancelRow, cancelCol);
                    break;
                case 3:
                    System.out.print("Enter row number to check: ");
                    int checkRow = scanner.nextInt();
                    System.out.print("Enter column number to check: ");
                    int checkCol = scanner.nextInt();
                    boolean available = airplaneSeating.isSeatAvailable(checkRow, checkCol);
                    System.out.println("Seat availability: " + (available ? "Available" : "Occupied"));
                    break;
                case 4:
                    airplaneSeating.displaySeatingChart();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
