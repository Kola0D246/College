public class TypeCastingDemo {

    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue;   // int > double

        System.out.println("Implicit Type Casting:");
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double num = 45.78;
        int intNum = (int) num;   // double > int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + num);
        System.out.println("Int Value: " + intNum);
    }
}