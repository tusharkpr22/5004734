public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Adding employees
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 80000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 55000));
        ems.addEmployee(new Employee("E004", "David", "Developer", 60000));
        ems.addEmployee(new Employee("E005", "Eve", "HR", 50000));

        // Traversing employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearch for Employee ID E003:");
        Employee foundEmployee = ems.searchEmployee("E003");
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");

        // Deleting an employee
        System.out.println("\nDeleting Employee ID E002:");
        boolean isDeleted = ems.deleteEmployee("E002");
        System.out.println(isDeleted ? "Employee deleted" : "Employee not found");

        // Traversing employees after deletion
        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}

