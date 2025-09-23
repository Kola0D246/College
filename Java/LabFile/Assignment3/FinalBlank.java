public class FinalBlank { 
    public static void main(String[] args) { 
        Student s = new Student(101); 
        s.show(); 
    } 
} 

class Student { 
    final int ROLL_NO; 
 
    Student(int r) { 
        ROLL_NO = r; 
    } 
 
    void show() { 
        System.out.println("Roll No: " + ROLL_NO); 
    } 
}