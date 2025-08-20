public class JavaMaths {        // build in class Math
    public static void main(String[] args) {
        // Math Constants
        System.out.println(Math.PI);    // pi
        System.out.println(Math.E);    // Euler number

        // Math methods
        System.out.println(Math.pow(2, 3));  // raise 2 to power 3; output in double
        System.out.println(Math.abs(-5.76));     // gives abslute value, mod |x|
        System.out.println(Math.sqrt(9));      // gives square root
        System.out.println(Math.round(5.25));  // round to nearest integer
        System.out.println(Math.ceil(-5.76));    // round up (+ side)
        System.out.println(Math.floor(-5.76));   // round down (- side)
        System.out.println(Math.max(10, 20));  // give max from two numbers
        System.out.println(Math.min(10, 20));  // give min from two numbers
    }
}
