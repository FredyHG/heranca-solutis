public class SalespersonTest {
    public static void main(String[] args) {
        Salesperson salesperson = new Salesperson("Alice Johnson", "789 Maple St.", "555-2468", 20, 2800.0, 7.5, 10000.0, 5.0);

        System.out.println(salesperson);

        System.out.println("Net Salary: " + salesperson.calculateSalary());
    }
}