public class TestAdministrator {
    public static void main(String[] args) {
        Administrator administrator = new Administrator("Carlos Pereira", "D St, 321", "1234-9876", 5, 5000.0, 10.0, 1000.0);

        System.out.println("Administrator: " + administrator);

        System.out.println("Final salary of the administrator: " + administrator.calculateSalary());
    }
}