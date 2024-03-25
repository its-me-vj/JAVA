import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double salary;

    // Constructor
    Employee(int eNo, String eName, double salary) {
        this.eNo = eNo;
        this.eName = eName;
        this.salary = salary;
    }

    // Method to display employee information
    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: $" + salary);
    }
}

public class pgm15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        // Create an array of Employee objects
        Employee[] employees = new Employee[n];

        // Input employee information
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            System.out.print("Employee Name: ");
            String eName = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            // Create Employee object and add to array
            employees[i] = new Employee(eNo, eName, salary);
        }

        // Search for an employee by eNo
        System.out.print("\nEnter the employee number to search: ");
        int searchEno = scanner.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.eNo == searchEno) {
                System.out.println("\nEmployee found. Details:");
                emp.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}


