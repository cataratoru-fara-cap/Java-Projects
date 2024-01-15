public class ApartmentLoan extends Loan{

    public ApartmentLoan(String firstName, String lastName, String address, double sum) {
        super(firstName, lastName, address, sum);
        setUnpaidSum(this.getSum());
    }

    public ApartmentLoan(String firstName, String lastName, String address, String frequency, double sum) {
        super(firstName, lastName, address, frequency, sum);
        setUnpaidSum(this.getSum());
    }

    @Override
    public void computeInstalment() {
        if (getFrequency().equals("Trimestriele"))
            this.instalment = super.getSum() / 3 + super.getSum() / 100 * 3;
        else    
            super.computeInstalment();
    }
}