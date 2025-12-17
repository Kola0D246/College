// print each String input of cmd line argument in separate line

public class CmdInput {
    public static void main(String args[]) {
        for (String i: args) {
            System.out.println(i);
        }
        // enhanced for loop (also known as a "for-each" loop)
        // iterates through each element of the args array, assigning each element to the variable arg in each iteration
    }
}
