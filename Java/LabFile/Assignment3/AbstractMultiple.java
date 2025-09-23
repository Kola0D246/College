public class AbstractMultiple { 
    public static void main(String[] args) { 
        Vehicle v1 = new Bike(); 
        Vehicle v2 = new Car(); 
        v1.run(); 
        v2.run(); 
    } 
} 

abstract class Vehicle { 
    abstract void run(); 
} 
 
class Bike extends Vehicle { 
    void run() { 
        System.out.println("Bike is running"); 
    } 
} 
 
class Car extends Vehicle { 
    void run() { 
        System.out.println("Car is running"); 
    } 
}
 