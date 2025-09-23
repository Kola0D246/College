class DefaultConstructor {
    public static void main(String[] args) {
        Student S1 = new Student();
    }
}

class Student {
    Student() {
        System.out.println("Object is created");
    }
}
