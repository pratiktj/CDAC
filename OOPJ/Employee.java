package assignment5;
//question 3
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;
    
    private int id;
    private String name;
    private double salary;
    
    private static List<Employee> employees = new ArrayList<>();
    
    // Static initializer
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }
    
    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
        employees.add(this);
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        totalSalaryExpense -= this.salary;
        this.salary = salary;
        totalSalaryExpense += salary;
    }
    
    // Static methods
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    
    public static void applyRaise(double percentage) {
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() * (1 + percentage / 100));
        }
    }
    
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }
    
   
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
    
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Total Employees");
            System.out.println("3. Apply Raise to All Employees");
            System.out.println("4. Calculate Total Salary Expense");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    new Employee(id, name, salary);
                    break;
                case 2:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;
                case 3:
                    System.out.print("Enter Raise Percentage: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage);
                    break;
                case 4:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;
                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int empId = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee emp : employees) {
                        if (emp.getId() == empId) {
                            emp.setSalary(newSalary);
                            break;
                        }
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}