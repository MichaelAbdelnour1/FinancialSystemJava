import java.io.*;
import java.util.*;


public class CSVReader {
    public static List<Employee> readEmployeesFromCSV(String file) throws IOException {
        List<Employee> employees = new ArrayList<>(); // <- Employee OBJ
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double salary = Double.parseDouble(tokens[2]);
                String position = tokens[3];
                String department = tokens[4];
                int hourlyRate = Integer.parseInt(tokens[5]);
                employees.add(new Employee(id, name, salary, position, department, hourlyRate));
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return employees;
    }


}


/* Hint: Example method signature:
public static void writeEmployeesToCSV(List<Employee> employees, String file)
 */