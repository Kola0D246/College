public class AbstractExample { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.sound(); 
        d.eat(); 
    } 
} 

abstract class Animal { 
    abstract void sound(); 
 
    void eat() { 
        System.out.println("Animals eat food."); 
    } 
} 
 
class Dog extends Animal { 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
}