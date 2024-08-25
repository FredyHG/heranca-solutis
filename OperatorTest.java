public class OperatorTest {
    public static void main(String[] args) {
        Operator worker = new Operator("Jane Smith", "456 Oak St.", "555-9876", 15, 3000.0, 8.0, 5000.0, 10.0);

        System.out.println(worker);

        System.out.println("Net Salary: " + worker.calculateSalary());
    }
}