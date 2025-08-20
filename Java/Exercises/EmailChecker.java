// Check if email is valid and print its domain and user name
import java.util.Scanner;

class EmailChecker {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your email:");
        String email = scan.next();

        if (email.contains("@")) {
            int index = email.indexOf("@");
            String user = email.substring(0, index);
            String domain = email.substring(index +1);

            System.out.println("user = " + user);
            System.out.println("domain = " + domain);
        }
        else {
            System.out.println("email does not contain @domainName");
        }
        scan.close();
    }
}