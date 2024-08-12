package employee.management;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Developer");
        Employee emp2 = new Employee("Bob", "Manager");
        Employee emp3 = new Employee("Charlie", "Designer");

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println(emp1 + ", Salary: " + calculator.calculateSalary(emp1));
        System.out.println(emp2 + ", Salary: " + calculator.calculateSalary(emp2));
        System.out.println(emp3 + ", Salary: " + calculator.calculateSalary(emp3));
    }
}

