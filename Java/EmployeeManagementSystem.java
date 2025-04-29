package oops;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class EmployeeManagementSystem {
    static final String DB_URL = "jdbc:mysql://localhost:3306/management_system";
    static final String USER = "root";
    static final String PASS = "Azeem@2003";

    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            while (true) {
                System.out.println("\n ***** Employee Management System *****");
                System.out.println("1. Add a new employee");
                System.out.println("2. View all employees");
                System.out.println("3. Update an employee by ID");
                System.out.println("4. Delete an employee by ID");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();  // consume newline

                switch (choice) {
                    case 1 -> addEmp();
                    case 2 -> viewEmp();
                    case 3 -> updateEmp();
                    case 4 -> deleteEmp();
                    case 5 -> {
                        conn.close();
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmp() {
        try {
            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            System.out.print("Enter the  email: ");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid email format.");
                return;
            }
            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            String query = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setDouble(3, salary);

            int rows = pst.executeUpdate();
            System.out.println(rows + " successfully added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void viewEmp() {
        try {
            String query = "SELECT * FROM employees";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.printf("%-5s %-20s %-30s %-10s\n", "ID", "Name", "Email", "Salary");
            System.out.println("--------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-30s %-10.2f\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary"));
            }
            System.out.println("--------------------------------------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void updateEmp() {
        try {
            System.out.print("Enter employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid email format.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = sc.nextDouble();

            String query = "UPDATE employees SET name=?, email=?, salary=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setDouble(3, salary);
            pst.setInt(4, id);

            int rows = pst.executeUpdate();
            if (rows > 0)
                System.out.println("Employee updated successfully.");
            else
                System.out.println("Employee with ID " + id + " not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deleteEmp() {
        try {
            System.out.print("Enter employee ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM employees WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            int rows = pst.executeUpdate();
            if (rows > 0)
                System.out.println("Employee deleted successfully.");
            else
                System.out.println("Employee with ID " + id + " not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static boolean isValidEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        return Pattern.matches(regex, email);
    }
}

