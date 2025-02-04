package MapReduceDemo;

public class MapReduceEmployees {
    public static void main(String[] args) {
        double avgSalary = EmployeeDatabase.getEmployees().stream().filter(employee->employee.getGrade().equalsIgnoreCase("B")).map(employee->employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avgSalary);

        double sumSalary = EmployeeDatabase.getEmployees().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("B")).map(employee -> employee.getSalary()).mapToDouble(i->i).sum();
        System.out.println(sumSalary);
    }
}
