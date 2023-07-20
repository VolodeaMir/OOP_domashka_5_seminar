package task3;

public class Employee extends Person {
    private double salary;
    private String department;

    public Employee(String name, int age, String address, double salary, String department) {
        super(name, age, address);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
