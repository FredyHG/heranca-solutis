public class TestSupplier {
    public static void main(String[] args) {
        Person person = new Person("João Silva", "Rua A, 123", "1234-5678");
        System.out.println("Person: " + person);

        Supplier supplier = new Supplier("Maria Oliveira", "Rua B, 456", "9876-5432", 5000.0, 2000.0);
        System.out.println("Supplier: " + supplier);

        System.out.println("Supplier balance: " + supplier.getBalance());
    }
}
