import java.util.Scanner;

public class JavaIfelse {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        // if statement performs the block of code enclosed in {} when given condition enclosed in () is true
        // else statement performs the block of code enclosed in {} when all the if and else if conditions above it are false
        // else if statement performs the block of code enclosed in {} when given condition enclosed in () is true and all the if and else if conditions above it are false
        // If any of if or else if condtion is true. the remaining else if statement are not checked
        

        // ---------- TEST PROGRAMS ----------

        // User Inputs
        System.out.print("Enter your name: "); String name = scan.nextLine();
        System.out.print("Enter your age: "); int age = scan.nextInt();
        System.out.print("Are you a student (true/false):"); boolean isStudent = scan.nextBoolean();
        System.out.print(" Total Price:"); double price = scan.nextDouble();

        // to check for empty string
        if (name.isEmpty()) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        // Numeric Condition -> vote eligibility test
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else if (age > 0 && age < 18) {
            System.out.println("You are NOT eligible to vote");
        } else {
            System.out.println("Invalid age");
        }

        // Boolean condition -> Are you student?
        if (isStudent) {
            System.out.println("Good! Study hard!");
        }

        // Ternary operator ~ Syntax ->   condition ? if_true : if_false
        String voting = age >= 18 ? "eligible" : "Not eligible";
        System.out.println(voting + " to vote");

        // Condition using logical statement

        if (age >= 60 && isStudent) {
            System.out.println("You get the senior plus the student discount");
            System.out.println("Total discount you get is 30%");
            System.out.printf("Final Price = %.2f", price*0.7);
        }
        else if (age >= 60) {
            System.out.println("You get the student discount");
            System.out.println("Total discount you get is 10%");
            System.out.printf("Final Price = %.2f", price*0.9);
        }
        else if (isStudent) {
            System.out.println("You get the senior discount");
            System.out.println("Total discount you get is 20%");
            System.out.printf("Final Price = %.2f", price*0.8);
        }
        else {
            System.out.println("No discount applicable");
            System.out.printf("Final Price = %.2f", price);
        }

        // Nested if else - using if else statement inside another if else statement
        // This is use when we want follow up conditions ie check next condition if first condition is true
        
        if (isStudent) {
            if (age >= 60) {
                System.out.println("You get the senior plus the student discount");
                System.out.println("Total discount you get is 30%");
                System.out.printf("Final Price = %.2f", price*0.7);
            }
            else {
                System.out.println("You get the student discount");
                System.out.println("Total discount you get is 10%");
                System.out.printf("Final Price = %.2f", price*0.9);
            }
        } 
        else {
            if (age >= 60) {
                System.out.println("You get the senior discount");
                System.out.println("Total discount you get is 20%");
                System.out.printf("Final Price = %.2f", price*0.8);
            }
            else {
                System.out.println("No discount applicable");
                System.out.printf("Final Price = %.2f", price);
            }
        }

        // Close Scanner object
        scan.close();
    }
}

//Approach	Behavior	Best For
//Nested if	Checks only next condition if previous passed	Step-by-step dependency, grouped logic
//else if	Flat structure, checks conditions in order	Linear validation, one message at a time
//Logical &&	All at once, short-circuits internally	One final success/failure, no stepwise logic

