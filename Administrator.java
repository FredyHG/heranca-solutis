public class Administrator extends Employee{

    private Double expenseAllowance;

    public Administrator(String name, String phone, String address, Integer departmentCode, Double baseSalary, Double tax, Double expenseAllowance) {
        super(name, phone, address, departmentCode, baseSalary, tax);
        this.expenseAllowance = expenseAllowance;
    }

    public Double getExpenseAllowance() {
        return expenseAllowance;
    }

    public void setExpenseAllowance(Double expenseAllowance) {
        this.expenseAllowance = expenseAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + expenseAllowance;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", sectorCode=" + getDepartmentCode() +
                ", baseSalary=" + getBaseSalary() +
                ", tax=" + getTax() +
                ", expenseAllowance=" + expenseAllowance +
                ", finalSalary=" + calculateSalary() +
                '}';
    }
}
