import java.util.Scanner;

public class JavaOperators {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] arg) {
        // Create Scanner object
        Scanner scan = new Scanner(System.in);

        // Declare variables and Input values
        int x, y, z;                 // 1 is assign to only i; x, y and z are only declared
        double a, b; a = b = 10.5;   // 10.5 is assign to both a and b (variables must be declared beforehand)
        boolean m = true, n = false;
        String S1 = "hello ", S2 = "hello ", S3 = new String("hello ");

        System.out.print("x = "); x = scan.nextInt();
        System.out.print("y = "); y = scan.nextInt();
        

        // Arithmatic oprators
        System.out.println("Name | Operator | Expression | Result");
        System.out.println("-----|----------|------------|-------");
        System.out.println("Add      | + | x + y | " + (x+y));    // Add the operands on either side
        System.out.println("Subtrat  | - | x - y | " + (x-y));    // Subtract the right operand from left
        System.out.println("Multiply | * | x * y | " + (x*y));    // Multiply the operand on either side
        System.out.println("Divide   | / | x / y | " + (x/y));    // Divide the left operand by right and give qoutient
        System.out.println("Modulus  | % | x % y | " + (x%y));    // Divide the left operand by right and give remainder

        System.out.println("x + a = " + (x+a));    // In int double operations, result is always be double
        System.out.println("y / b = " + (y/b));    // In int int division, java neglects the decimal part of result
        System.out.println("a / b = " + (a/b));    // But if one or both operand are double, then result is also in double

        System.out.println(S1+S2);    // Concatination - Joining two string or array

        // Order of Operation for Arithmatic Operators
        // PEMDAS => Parenthesis Exponent Multiplication Division Addition Subtraction 

        // (Augmented) Assignment operators
        System.out.println("Name | Operator | Expression | Result");
        System.out.println("-----|----------|------------|-------");
        System.out.println("Assign          | =  | z = x  | " + (z =x));
        System.out.println("Add Assign      | += | x += y | " + (x+=y));    // Add the operands on either side
        System.out.println("Subtrat Assign  | -= | x -= y | " + (x-=y));    // Subtract the right operand from left
        System.out.println("Multiply Assign | *= | x *= y | " + (x*=y));    // Multiply the operand on either side
        System.out.println("Divide Assign   | /= | x /= y | " + (x/=y));    // Divide the left operand by right and give qoutient
        System.out.println("Modulus Assign  | %= | x %= y | " + (x%=y));    // Divide the left operand by right and give remainder

        // Increment (+1) and Decrement (-1) operators
        System.out.println("Name | Expression | Result");
        System.out.println("-----|------------|-------");
        System.out.println("Pre-increment  | ++i | " + (++z));    // increment before executing the whole statement
        System.out.println("Post-increment | i++ | " + (z++));    // increment after executing the whole statement
        System.out.println("Pre-decrement  | --i | " + (--z));    // decrement before executing the whole statement
        System.out.println("Post-decrement | i-- | " + (z--));    // decrement after executing the whole statement

        // Relational/ Comparison Operators - result is always boolean; use in conditions
        System.out.println("Name | Operator | Expression | Result");
        System.out.println("-----|----------|------------|-------");
        System.out.println("Equal to     | == | x == y | " + (x==y));   // true if operand on either side are equal, else false
        System.out.println("Not equal to | != | x != y | " + (x!=y));   // true if operand on either side are NOT equal, else false
        System.out.println("Greater than | >  | x > x  | " + (z>x));    // true if operand on left side is greater than operand on right side, else false
        System.out.println("Lesser than  | <  | x < y  | " + (x<y));    // true if operand on left side is lesser than operand on right side, else false
        System.out.println("Greater than or equal to | >= | x >= y | " + (x>=y));    // true if operand on left side is greater than or eual to operand on right side, else false
        System.out.println("Lesser than or equal to  | <= | x <= y | " + (x<=y));    // true if operand on left side is lesser than or eual to operand on right side, else false

    // NOTE for == operator on Java String:

   /*
    * For primitive datatype linke int, double, etc; the == operator check whether the VALUES are equal or not
    * But for reference datatypes like string, array, etc; the == operator check whether REFRENCE is same or not
    * ie, whether the operand point to same memory location
    * 
    * This creates 3 conditions
    * 1) S1 and S2 store same string literal and assign in program, then S1 == S2 gives true 
    * Because during compilation, S1 and S2 get pooled together in same memory location and become single object with same reference
    * 
    * 2) S1 is assign in program and S2 is input from console/file or created with new keyword, then S1 == S2 gives false
    * Because both are separate object in memory and store in different locations with different reference
    * 
    * 3) Use S2 = S2.intern() method, then S1 == S2 gives true because S2 will get pooled with S1 at same memory location.
    */

        System.out.print(S1 == S2);     // true because both S1 and S2 are pooled to same memory location
        System.out.print(S1 == "hello "); 
        System.out.println(S1 == S3);   // false because we explicitly create a separate object in memory

        // to compare string literals, its better to use .equal() method instead
        System.out.print(S1.equals(S2));
        System.out.print(S1.equals("hello "));
        System.out.println(S1.equals(S3));   // true, since values are same

        // Logical Operators - Decision making; Join two Conditions
        System.out.println("Name | Operator | Expression | Result");
        System.out.println("-----|----------|------------|-------");
        System.out.println("and | && | m && n | " + (m && n));    // true if both the operands on either side are true, else false
        System.out.println("or  | || | m || n | " + (m || n));    // true if any one of operands on either side are true, else false
        System.out.println("not | !  | !n     | " + (!n));        // flip boolean value (true <--> False)

        // Bitwise Operators

        // Close Scanner object
        scan.close();
    }
}
