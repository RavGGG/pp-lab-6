import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();

            employees.add(new Worker ("Worker1", 3000, 0, "05-12-2020", "Developer"));
            employees.add(new Worker("Worker2", 5000 , 1,"05-12-2020", "Developer"));
            employees.add(new Worker("Worker3", 8000, 3,"04-09-2020", "Developer"));
            employees.add(new Worker("worker4", 4500, 4,"05-11-2021", "Tester"));
            employees.add(new Manager("Manager", 10000, 5,"05-11-2010", "Project Manager"));

            
            
            
            for (Employee employee : employees) {
                System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                                   ", Position: " + employee.getPosition() +
                                   ", Hire date: " + employee.getHireDate() +
                                   ", Salary:" + employee.getSalary() + ")");
            }
         




    }
}
