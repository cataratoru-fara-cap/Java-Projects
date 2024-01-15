public class Loan {
    private int id;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    private String frequency;
    private double sum;
    private double instalment;
    private double unpaidSum;

    public Loan(String firstName, String lastName, String address, double sum) {
        firstName = this.firstName;
        lastName = this.lastName;
        address = this.address;
        sum = this.sum;
        unpaidSum = this.sum;
    }
    
    public Loan(String firstName, String lastName, String address, String frequency, double sum) {
        firstName = this.firstName;
        lastName = this.lastName;
        address = this.address;
        frequency = this.frequency;
        sum = this.sum;
        unpaidSum = this.sum;
    }

    public double getUnpaidSum() {
        return this.unpaidSum;
    }

    public double getSum(){
        return this.sum;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getFrequency() {
        return frequency;
    }

    public double getInstalment() {
        return instalment;
    }

    public void setUnpaidSum(double unpaidSum) {
        this.unpaidSum = unpaidSum;
    }

    public void computeInstalment() {
        this.instalment = getSum() / 10;
    }
    
    public void payInstalment() {
        if (getUnpaidSum() != 0)
            setUnpaidSum(getUnpaidSum() - getInstalment());
        else
            System.out.println("Loan already payed");
    }

    @Override
    public String toString() {
        return "Loan [id=" + id + ", number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
                + ", address=" + address + ", frequency=" + frequency + ", sum=" + sum + ", instalment=" + instalment
                + ", unpaidSum=" + unpaidSum + "]";
    }
    
}

