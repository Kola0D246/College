class Student { 
    int roll; 
    String name; 
    static String school = "ABC School"; 
 
    Student(int r, String n) { 
        roll = r; 
        name = n; 
    } 
 
    void display() { 
        System.out.println(roll + " " + name + " " + school); 
    } 
 
    public static void main(String[] args) { 
        Student s1 = new Student(1, "Raj"); 
        Student s2 = new Student(2, "Simran"); 
 
        s1.display(); 
        s2.display(); 
    } 
}