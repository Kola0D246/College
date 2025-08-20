import java.util.Scanner;  // import scanner object from util class of Java

public class JavaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first Scanner is class. First letter is upper case
        // second scanner is object. First letter is small case
        // system.in means it takes input from console
        // It can be file object also

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        // because we use println(), input is taken on next line
        // takes user input (including spaces) and store in variable name

        System.out.print("Enter your branch: ");
        String branch = scanner.next();
        // because we use print(), input is taken on same line
        // input breaks with first space
        // AI DS - only take AI as input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();            // nextInt takes int input

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();      // nextDouble takes double input

        System.out.print("Do you get scholarship?");
        boolean getScholarship = scanner.nextBoolean();     // nextBoolean takes boolean input

        System.out.printf("""
        Hello! I am %s.
        Branch %s
        I am %d years old.
        I scored %f.02f GPA last semester
        But my scholarship status is: %b
        """, name, branch, age, gpa, getScholarship);       // Another way for printing multiline format specifier string

        // BUFFER ERROR
        // Using nextLine() after nextInt(), nextDouble(), nextBoolean(), etc.
        // the nextLine() takes up the \n end line character at end of other next methods as its input resulting in unexpected behaviour

        System.out.println("What is your favorite number?");
        int num = scanner.nextInt();
        scanner.nextLine();     //Buffer nextLine()

        System.out.println("What is your favorite color?");
        String color = scanner.nextLine();
        // does not take input for color from user.
        // To resolve this, we can use empty scanner.nextLine() below nextInt which will take the \n character and rest will work as intended

        System.out.println("Favorite number = " + num);
        System.out.println("Favorite color = " + color);
       

        scanner.close();        // to close the scanner object 
    }
}
