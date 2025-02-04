package MapReduceDemo;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String grade;

    public Employee() {}

    public Employee(int id, String name, double salary, String grade) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


}
