import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {




        String inputFile = "C:\\Users\\micha\\IdeaProjects\\FinancialSystemJava\\src\\financial_management_system.csv";
        List<Employee> employees = CSVReader.readEmployeesFromCSV(inputFile);
        FinancialOperations fO1 = new FinancialOperations();
        System.out.println("1 - getHourlyRateSum : " + fO1.getHourlyRateSum(employees));
        System.out.println("2 - sumDepartmentHourlyRate Finance: "+fO1.sumDepartmentHourlyRate(employees, "Finance"));
        System.out.println("3 - getAverageHourlyRateByDepartment : " + fO1.getAverageHourlyRateByDepartment(employees));
        System.out.println("4 - getTotalSalaryByDepartment : " + fO1.getTotalSalaryByDepartment(employees));
        System.out.println("5 - getAverageSalaryByDepartment : "+ fO1.getAverageSalaryByDepartment(employees));
        System.out.println("6 - getTotalHourlyRateByDepartment : " + fO1.getTotalHourlyRateByDepartment(employees));
        System.out.println("7 - getSumOfEmployeeIdDigits : " + fO1.getSumOfEmployeeIdDigits(employees));

        CSVWriter csvWriter = new CSVWriter();
        csvWriter.writeEmployeesToCSV(employees, "output.csv");

        /*
        Demonstrate the functionality of FinancialOperations methods using traditional approach.
        Hint: Call the methods and print the results.
        Demonstrate the functionality of FinancialOperations methods using streams.
        Hint: Call the methods and print the results.
        Write results to new CSV files using CSVWriter.
        Hint: Example method call: CSVWriter.writeEmployeesToCSV(employees, "output.csv").
        Hint: Create a file for each department that includes all employees from that department:  CSVWriter.writeEmployeesToCSV(hrEmployees, "output_hr_employees.csv");.
        */


    }
}
