public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "123 Elm St.", "555-1234", 12, 3500.0, 10.0);

        System.out.println(employee);

        System.out.println("Net Salary: " + employee.calculateSalary());
    }
}
