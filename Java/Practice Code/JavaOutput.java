

public class JavaOutput {
    public static void main(String[] arg) {
        // Single line Comment
        // Comment dont get compiled. They are just side note to other programmer

        /*
         * Multi
         * Line
         * Comment
         */

        // print() - output string as it is on terminal screen. Not add any space or new line at end of string.
        System.out.print("Hello Java ");    // Each statement end with semicolon ;
        System.out.print("from print()\n");  // to change line in print() use new line charcater \n 

        // println() automatically add new line at end
        System.out.println("Hello Java");
        System.out.println("from println()");
        
        // printf() is use to format output using format specifierIts. Its general syntax is:
        // %[argument_index$][flags][padding][.precision][type-specifier]
        // Like print(), we need to add \n at end in printf() for new line

        // type-specifier
        char k = 'G';
        String s = "Hello";
        int a = 10, b=2500000, c= -34;
        double w = 12.5;
        boolean bool = true;
        
        System.out.printf("%c\n", k);     // %c is type specifier of char; replace by value of k ie 'G' in output
        System.out.printf("%s\n", s);     // %s (small s) print string as it is
        System.out.printf("%S\n", s);     // %S (capital S) print string captilized
        System.out.printf("%d\n", a);   // %d is type specifier for int, byte, short, long
        System.out.printf("%o\n", a);    // %o or %O convert number to octal in print
        System.out.printf("%x\n", a);    // %x or %X convert number to hexadecimal in print
        System.out.printf("%h\n", a);    // %h or %H convert hashcode to hexadecimal in print
        System.out.printf("%f kg apples\n", w);  // %f is type spcifier for float and double
        System.out.printf("%e\n", w); // %e or %E convert floating point to scientific notion
        System.out.printf("Am I student? %b\n", bool);    // %b is type spcifier for boolean

        System.out.printf("I scored 90%%\n");    // %% --> % in printf() statement

        // Precision
        System.out.printf("%.0f\n", w);   // precision for 0 decimal point
        System.out.printf("%.2f\n", w);   // precision for 2 decimal point
        System.out.printf("%.3s\n", s);   // max string character to print

        // padding
        System.out.printf("%04d\n", a);   // 0n Add preceding 0 until int become n digit long
        System.out.printf("%4d\n", a);    // n Add preceding space until int become n digit long
        System.out.printf("%-4d\n", a);   // -n Add space from right end until int become n digit long

        // flags
        System.out.printf("%+d\n", a);   // + flag join + sign before positive numbers
        System.out.printf("%,d\n", b);   // , flag add comma grouping for numbers after 3 places
        System.out.printf("%(d\n", c);   // ( flag enclose negative number in bracket
        System.out.printf("% d\n", c);   // blank space add a space before positive number for better alignment
        // ` flag

        // argumented index $
        // Notmally, variable replace format specifier in corresponding order
        // But argumented index is use to refer to the same argument (by index) multiple times
        System.out.printf("%1$d %1$x %2$s", a, s);






        





    
    }
}
