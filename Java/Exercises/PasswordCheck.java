import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter new password: "); 
    }
    
}

if (password.length() < 8) {
    System.out.println("Password must be at least 8 characters long.");
} else if (!password.matches(".*[A-Z].*")) {
    System.out.println("Password must contain at least one uppercase letter.");
} else if (!password.matches(".*[a-z].*")) {
    System.out.println("Password must contain at least one lowercase letter.");
} else if (!password.matches(".*\\d.*")) {
    System.out.println("Password must contain at least one digit.");
} else if (!password.matches(".*[!@#$%^&*()].*")) {
    System.out.println("Password must contain at least one special character.");
} else {
    System.out.println("Password is strong.");
}