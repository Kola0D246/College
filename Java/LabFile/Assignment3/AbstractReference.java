public class AbstractReference { 
    public static void main(String[] args) { 
        Person p = new Student(); 
        p.display(); 
    } 
} 

abstract class Person { 
    abstract void display(); 
} 
 
class Student extends Person { 
    void display() { 
        System.out.println("I am a Student"); 
    } 
} 
 