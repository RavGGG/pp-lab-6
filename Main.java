import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Worker ("Worker1", 3000,1),
            new Worker("Worker2", 5000 , 1),
            new Worker("Worker 3", 8000, 3),
            new Worker("worker 4", 4500, 4),
            new Manager("Manager", 10000, 5)
         };

         for(Employee employee: employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary()) ;
            employee.work();
         }

         




    }
}
