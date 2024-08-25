public class Salesperson extends Employee {
    private double salesValue;
    private double commission;

    public Salesperson(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double salesValue, double commission) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.salesValue = salesValue;
        this.commission = commission;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        double baseSalaryAfterTax = super.calculateSalary();
        double commissionValue = salesValue * (commission / 100);
        return baseSalaryAfterTax + commissionValue;
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", departmentCode=" + getDepartmentCode() +
                ", baseSalary=" + getBaseSalary() +
                ", tax=" + getTax() +
                ", salesValue=" + salesValue +
                ", commission=" + commission +
                ", netSalary=" + calculateSalary() +
                '}';
    }
}
