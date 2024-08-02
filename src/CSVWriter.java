import java.io.*;
import java.util.*;
// Employee employee

public class CSVWriter {
    public void writeEmployeesToCSV(List<Employee> employees, String file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("id,name,salary,position,department,hourly_rate");
            writer.newLine();

            for(Employee e : employees){
                writer.write(
                        String.format(
                                "%d,%s,%.2f,%s,%s,%.2f",
                                e.getId(),
                                e.getName(),
                                e.getSalary(),
                                e.getPosition(),
                                e.getDepartment(),
                                e.getHourly_rate()
                        )
                );
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
