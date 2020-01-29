public class Employee extends Person {
    
    private double salary;
    private int yrStarted;
    private String insuranceNum;

    public Employee(String n, double salary, int yrStarted, String insuranceNum) {
        super(n);
        this.salary = salary;
        this.yrStarted = yrStarted;
        this.insuranceNum = insuranceNum;
    }

    public double getSalary() {
        return salary;
    }

    public int getYrStarted() {
        return yrStarted;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}