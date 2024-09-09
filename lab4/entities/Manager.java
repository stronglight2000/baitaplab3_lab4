package lab4.entities;

public class Manager extends BaseStaff {
    private double responSalary;

    public Manager(String fullname, double salary) {
        super(fullname, salary);
    }

    public Manager(String fullname, double responSalary, double salary) {
        super(fullname, salary);
        this.responSalary = responSalary;
    }

    public double getResponSalary() {
        return responSalary;
    }

    public void setResponSalary(double responSalary) {
        this.responSalary = responSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "responSalary=" + responSalary +
                '}';
    }
}
