// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

public class OnRoad {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();   // Vehicle constructor
        Car c = new Car();          // Car constructor

        v.drive();
        c.drive();
    }
}

class Vehicle {
    void drive() { 
        System.out.println("driving....");

    }
}

class Car extends Vehicle {
    void drive() {          //override
        System.out.println("Repairing a car...");

    }
}