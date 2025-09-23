public class FinalClass { 
    public static void main(String[] args) { 
        Vehicle v = new Vehicle(); 
        v.show(); 
    } 
}

final class Vehicle { 
    void show() { 
        System.out.println("Vehicle class."); 
    } 
} 
 
// class Car extends Vehicle {}     //-- Error 
 
