class Student {
    String name, city;
    int age;

    Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    void printData () {
        System.out.println("Student Profile >>");
        System.out.println("Name: " +name);
        System.out.println("City: " +city);
        System.out.println("Age: " +age);
        }
}

class StudentDetail{
    public static void main(String[] args) {
        Student S1 = new Student("Koustubh Sinha", "Shivpuri", 20);
        Student S2 = new Student("Utkarsh Vishwakarma", "Jabalpur", 20);

        S1.printData();
        S2.printData();
    }
}