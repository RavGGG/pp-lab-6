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
            employees.add(new Worker("Worker4", 5500, 1, "05-11-2021", "Tester"));
            employees.add(new Manager("Manager", 10000, 5,"05-11-2010", "Project Manager"));
            employees.add(new Manager("Manager2", 10000, 5,"05-11-2010", "Project Manager"));

            
            
            
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
         
       //----------------------------------------------




    
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }


        double totalManagerSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            }
        }


        double totalWorkerSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }


        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        for (Employee employee : employees) {
            int id = employee.hashCode();
            int count = 0;
            for (Employee emp : employees) {
                if (emp.hashCode() == id) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Found " + count + " occurrences of employee with ID " + id);
            }
        }
    }
}
