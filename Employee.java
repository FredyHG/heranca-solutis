public class Employee extends Person {

    private Integer departmentCode;
    private Double baseSalary;
    private Double tax;

    public Employee(String name, String phone, String address, Integer departmentCode, Double baseSalary, Double tax) {
        super(name, phone, address);
        this.departmentCode = departmentCode;
        this.baseSalary = baseSalary;
        this.tax = tax;
    }

    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary * (1 - tax / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", departmentCode=" + departmentCode +
                ", baseSalary=" + baseSalary +
                ", tax=" + tax +
                ", netSalary=" + calculateSalary() +
                '}';
    }
}
