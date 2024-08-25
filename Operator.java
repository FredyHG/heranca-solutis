public class Operator extends Employee {
    private double productionValue;
    private double commission;

    public Operator(String name, String address, String phone, int departmentCode, double baseSalary, double tax, double productionValue, double commission) {
        super(name, address, phone, departmentCode, baseSalary, tax);
        this.productionValue = productionValue;
        this.commission = commission;
    }

    public double getProductionValue() {
        return productionValue;
    }

    public void setProductionValue(double productionValue) {
        this.productionValue = productionValue;
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
        double commissionValue = productionValue * (commission / 100);
        return baseSalaryAfterTax + commissionValue;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", departmentCode=" + getDepartmentCode() +
                ", baseSalary=" + getBaseSalary() +
                ", tax=" + getTax() +
                ", productionValue=" + productionValue +
                ", commission=" + commission +
                ", netSalary=" + calculateSalary() +
                '}';
    }

}
