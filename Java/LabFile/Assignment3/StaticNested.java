public class StaticNested { 
    public static void main(String[] args) { 
        Outer.Inner obj = new Outer.Inner(); 
        obj.display(); 
    } 
}

class Outer { 
    static class Inner { 
        void display() { 
            System.out.println("Hello from static nested class!"); 
        } 
    } 
} 