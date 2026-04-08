// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
import  java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        int salemp = sc.nextInt();

        System.out.print("Enter HR salary: ");
        int salhr = sc.nextInt();


        Employee emp = new Employee(salemp);
        HRManager hr = new HRManager(salhr);

        emp.work();
        emp.getSalary();

        hr.work();
        hr.getSalary();

        System.out.print("Enter new emp salary: ");
        int salnemp = sc.nextInt();
        hr.addEmployee(salnemp);
    }
}

// simple employee
class Employee {
    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }    

    void work() {
        System.out.println("Employee is working");
    }

    void getSalary() {
        System.out.println("Salary: " + this.salary);
    }
}

// HR 
class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }
    
    void work() {           // override
        System.out.println("HR is working");
    }

    void addEmployee(int salary) {      // add another employee
        System.out.println("HR manager added a employee.");
        Employee e = new Employee(salary);          // create new employee

        e.work();       // new employee work
        e.getSalary();  // new employee salary

    }
}