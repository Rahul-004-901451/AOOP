package employee.management;

import java.util.HashMap;
import java.util.Map;

public class SalaryCalculator {
    private static final Map<String, Double> SALARY_MAP = new HashMap<>();

    static {
        SALARY_MAP.put("Developer", 60000.0);
        SALARY_MAP.put("Manager", 80000.0);
        SALARY_MAP.put("Designer", 55000.0);
    }

    public double calculateSalary(Employee employee) {
        return SALARY_MAP.getOrDefault(employee.getRole(), 40000.0);
    }
}
