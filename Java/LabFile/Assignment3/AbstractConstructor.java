public class AbstractConstructor { 
    public static void main(String[] args) { 
        Employee e = new Manager(); 
        e.work(); 
    } 
}

abstract class Employee { 
    Employee() { 
        System.out.println("Employee constructor called."); 
    } 
 
    abstract void work(); 
} 
 
class Manager extends Employee { 
    void work() { 
        System.out.println("Manager is working."); 
    } 
} 