// import Random class of util library of Java
import java.util.Random;

public class RandomJava {
    public static void main(String[] args) {
        // Create a random object of Random class
        Random random = new Random();

        // Generate random int
        int num1 = random.nextInt();            // Gives a random int from complete int range
        int num2 = random.nextInt(10);    // Since bound is given 10 and origin (0) is not, gives a random int between 0 to 10
        int num3 = random.nextInt(1, 6);   // Gives any random int between origin (1; inclusive) and bound (6; exclusive)
        int num4 = random.nextInt(Integer.MIN_VALUE, 0);    // Gives any random int in negative int range

        // Generate random byte and short values using nextInt because they not have their own methods       
        byte num5 = (byte) random.nextInt(Byte.MAX_VALUE +1);                     // Gives a random int from 0 to MAX of byte range
        byte num6 = (byte) random.nextInt(Byte.MIN_VALUE, Byte.MAX_VALUE +1);     // Gives a random int from MIN to MAX of byte range
        short num7 = (short) random.nextInt(Short.MAX_VALUE +1);                  // Gives a random int from 0 to MAX of Short range
        short num8 = (short) random.nextInt(Short.MIN_VALUE, Short.MAX_VALUE +1); // Gives a random int from MIN to MAX of short range

        // Generate other datatype randomly 
        long num9 = random.nextLong();        // Gives a random long from long range
        float num10 = random.nextFloat();     // Gives a random float from float range - 0.0f (inclusive) to 1.0f (exclusive)
        double num11 = random.nextDouble();   // Gives a random double from double range - 0.0 (inclusive) to 1.0 (exclusive)
        double num12 = random.nextGaussian(); // Gives a normally distributed double with mean 0.0 and standard deviation 1.0. 
        // Basically further the number is from 0 on either side (+ and -), less likely it will be generated

        // outputs
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        // Random boolean - 50% probability of generating true or false
        boolean bool = random.nextBoolean();
        if (bool) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
