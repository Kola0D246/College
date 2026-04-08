// Write a java program to create a class Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

public class Sound {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();

        a.makeSound();
        c.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("bark");
    }
}