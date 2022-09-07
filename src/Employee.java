
public class Employee {
    private String fullName;
    private int department;
    private double salary;

    static int countId = 0;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        countId++;
        }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalaryInfo() {
        return salary;
    }
    public int getId() {
        return countId;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Имя: " + fullName + ", отдел: " + department + ", зарплата: " + salary;
    }
}