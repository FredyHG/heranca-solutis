public class Supplier extends Person {

    private Double creditValue;
    private Double debitValue;

    public Supplier(String name, String phone, String address, Double creditValue, Double debitValue) {
        super(name, phone, address);
        this.creditValue = creditValue;
        this.debitValue = debitValue;
    }

    public Double getBalance() {
        return creditValue - debitValue;
    }

    public Double getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(Double creditValue) {
        this.creditValue = creditValue;
    }

    public Double getDebitValue() {
        return debitValue;
    }

    public void setDebitValue(Double debitValue) {
        this.debitValue = debitValue;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", creditValue=" + getCreditValue() +
                ", debitValue=" + getDebitValue() +
                ", balance=" + getBalance() +
                '}';
    }
}
