// Variable -> named memory location to store some value

// Primitive datatypes -> int, long, short, byte, float, double, char, bool, void
// Reference datatypes -> string, array, object


public class JavaVariables {
    public static void main(String[] arg) {
        // int - whole number 32 bit
        int age;    // declaration
        age = 21;   // assignment

        int year = 2025;
        int quantity = 2;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println("I have " + quantity + " kg sugar");

        // byte - whole number 8 bit
        // short - whole number 16 bit
        // long - whole number 64 bit. 
        // long end with l or L, like float because by dafault, Java treat non-deciaml constant as int
        // byte and short constant < int, so no issue
        // long constant > int, so it wont get nough memory space and cause error

        byte rank = 2;
        short students = 12;
        long fees = 100000;

        System.out.print("My college fees is " + fees + "\n");
        System.out.println("Out of " + students + " I ranked " + rank);

        // float - decimal number upto 7 decimal point
        // double - decimal number upto 15 decimal point

        float prize = 19.99f;   //Add an f or F in the end
        float gpa = 3.5F;     // Or Java treat it like double by default and show error

        double temperature = 30.25;
        double speed = -12;

        System.out.println("""
            I got %.2f GPA so its time to have pizza party.
            I got them cheap at just %.2f per pizza.
            The temperature is %.2f C by the way.
            """.formatted(gpa, prize, temperature));
        // This is multiline formatted string
        // Enclosed in triple qoute
        // Use format specifier (%f for float and double) like C
        // .2 in %.2f tells the number of decimal point
        // Corresponding varaible are written in .formatted() function in same order

        System.out.println("Its -12, but double -> " + speed);
        
        // char - single character

        char grade = 'A';
        char symbol = '#';
        char digit = 1;   // this is not number, but unicode for (non-printable) control character U+0001
        char digit_ = '1';  // This is number character in unicode U+0031

        System.out.println("My score is: " + symbol + grade + digit);
        System.out.println("My rank is: " + symbol + grade + digit_);

        //boolean - true or false
        boolean isStudent = true;   //variable name is Java are camelCase
        boolean forSale = false;

        System.out.println("This book is for sale? " + forSale);

        // boolean statement are used conditional and logical statements

        if (isStudent && forSale) {     //and
            System.out.println("You got 40% discount!");
        }
        else if (isStudent || forSale) {   //or
            System.out.println("You got 20% discount!");
        }
        else {
            System.out.println("No discount now!");
        }

        // String - sequnce of characters enclosed in ""

        String name = "Koustubh";
        String food = "Pizza";

        System.out.print("Hello, " + name + "! ");
        System.out.print("Have some " + food);
        // Joining two string using + operator is called concatination

    }
}
