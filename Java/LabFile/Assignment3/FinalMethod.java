public class FinalMethod { 
    public static void main(String[] args) { 
        Child obj = new Child(); 
        obj.display(); 
    }
}

class Parent { 
    final void display() { 
        System.out.println("This is a final method."); 
    } 
} 
 
class Child extends Parent { 
    // void display() {}    //-- Error if uncommented 
}