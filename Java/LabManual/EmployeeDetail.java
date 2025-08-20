import java.util.Random;

class Employee {
    int id;
    String name;

    Employee(String name) {
        Random rdm = new Random();
        this.id = rdm.nextInt(1000,10000);
        this.name = name;
    }

    void printData(){
        System.out.println("Employee Details >>");
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
    }
}

class EmployeeDetail {
    public static void main(String[] args) {
        Employee E1 = new Employee("Rakesh");
        Employee E2 = new Employee("Sumitra");

        E1.printData();
        E2.printData();
    }
}
