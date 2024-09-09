package lab4.entities;

public class MarketingStaff extends BaseStaff {
    private double sales;
    private double commissionRate;

    public MarketingStaff(String fullname, double salary) {
        super(fullname, salary);
    }

    public MarketingStaff(String fullname, double sales, double commissionRate, double salary ) {
        super(fullname, salary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
