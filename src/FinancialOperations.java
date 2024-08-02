import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class FinancialOperations {

    public static double getHourlyRateSum(List<Employee> employees){
        return employees
                .stream()
                .mapToDouble(e -> e.getHourly_rate())
                .sum();
    }


    public static double sumDepartmentHourlyRate(List<Employee> employees, String department) {
        return employees
                .stream()
                .filter(e -> e.getDepartment().equals(department))
                .mapToDouble(e -> e.getHourly_rate())
                .sum();
    }

    public static double getAverageHourlyRateByDepartment(List<Employee> employees, String department) {
        return employees
                .stream()
                .filter(e-> e.getDepartment().equals(department))
                .mapToDouble(e -> e.getHourly_rate())
                .average()
                .orElse(0);
    }

    public static Map<String, Double> getTotalSalaryByDepartment(List<Employee> employees) {
        // Use Collectors.groupingBy and Collectors.summingDouble
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment(),
                        Collectors.summingDouble(e -> e.getSalary())
                ));
    }

    public static Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
        // Use Collectors.groupingBy and Collectors.averagingDouble
        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                        e -> e.getDepartment(),
                        Collectors.averagingDouble(e -> e.getSalary())
                        )
                );
    }

    public static Map<String, Double> getTotalHourlyRateByDepartment(List<Employee> employees) {
        // Use Collectors.groupingBy and Collectors.summingDouble
        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e.getDepartment(),
                                Collectors.summingDouble(
                                e-> e.getHourly_rate())
                        )
                );
    }

    public static Map<String, Double> getAverageHourlyRateByDepartment(List<Employee> employees) {
        // Use Collectors.groupingBy and Collectors.averagingDouble
        return employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                            e -> e.getDepartment(),
                            Collectors.averagingDouble(
                                    e -> e.getHourly_rate()
                            )
                        )
                );
    }

    public static int getNumSum(int number) {
        return number;
    }

    public static int getSumOfEmployeeIdDigits(List<Employee> employees) {
        // Use mapToInt and map(use helper function here) and sum.

        return employees
                .stream()
                .map(e -> e.getId())
                .mapToInt(e -> getNumSum(e))
                .sum();

    }
}
