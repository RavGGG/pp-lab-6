import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();

            employees.add(new Worker ("Worker1", 3000, 1, "05-12-2020", "Developer"));
            employees.add(new Worker("Worker2", 5000 , 1,"05-12-2020", "Developer"));
            employees.add(new Worker("worker3", 4500, 4,"05-11-2021", "Tester"));
            employees.add(new Manager("Manager", 10000, 5,"05-11-2010", "Project Manager"));

            
            
            
            for (Employee employee : employees) {
                System.out.println(employee.getName() + " has code: " + employee.hashCode());
            }


            Worker workerWithDuplicateHashCode = null;

        for (Employee employee : employees) {
            if (employee instanceof Worker && employee.hashCode() == 1) {
                workerWithDuplicateHashCode = (Worker) employee;
                break;
            }
        }

        if (workerWithDuplicateHashCode != null) {
            for (Employee employee : employees) {
                if (!employee.equals(workerWithDuplicateHashCode)) {
                    System.out.println(workerWithDuplicateHashCode.getName() + " equals " + employee.getName() + ": " + workerWithDuplicateHashCode.equals(employee));
                }
            }
        }
         
        


    }
}
