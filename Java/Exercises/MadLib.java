import java.util.Scanner;

public class MadLib {
    public static void main(String[] arg) {
        // Create scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to game of Madlib");
        System.out.println("Just Suggest a word based on part of Speech");
        System.out.println("and see what become of our little story");
        System.out.println("--------------------------------------------");

        // Input words
        System.out.print("noun1: "); String noun1 = scan.next();
        System.out.print("noun2: "); String noun2 = scan.next();
        System.out.print("noun3: "); String noun3 = scan.next();
        System.out.print("verb1: "); String verb1 = scan.next();
        System.out.print("pronoun1: "); String pronoun1 = scan.next();
        System.out.print("pronoun2: "); String pronoun2 = scan.next();
        System.out.print("adjective1: "); String adjective1 = scan.next();

        // Output Story
        System.out.println("I am learning " + noun1 + " from " + noun2);
        System.out.println(pronoun1 + " is " + adjective1 + " Youtuber");
        System.out.println(pronoun1 + " has lots of " + noun3 + " on different tech topics");
        System.out.println("I would " + verb1 + " " + pronoun2 + " videos to all my friends");
        System.out.println("Thank you " + noun2);

        // Close Scanner object
        scan.close();
    }
}