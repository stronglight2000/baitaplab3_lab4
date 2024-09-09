package lab4.entities;

public class BaseStaff {
    private int id;
    private static int autoId;
    private String fullname;
    private double salary;

    public BaseStaff(String fullname, double salary) {
        this.id = autoId++;
        this.fullname = fullname;
        this.salary = salary;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        BaseStaff.autoId = autoId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseStaff{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
