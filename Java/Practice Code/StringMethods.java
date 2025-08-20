class StringMethods {
    public static void main(String[] args) {
        String name = "  Bro code    ";

        System.out.println("int length = " + name.length());    // num of character in string
        System.out.println("char letter = " + name.charAt(4));  // give character at argumented index
        System.out.println("int index = " + name.indexOf('o'));    // give index of argumented letter first accurance from left
        System.out.println("int lastIndex = " + name.lastIndexOf('o'));     // give index of argumented letter first accurance from right
        System.out.println("name = " + name.toUpperCase());     // change all character to uppercase
        System.out.println("name = " + name.toLowerCase());     // change all character to lowercase
        System.out.println("name = " + name.trim());            // remove space on left and right of string
        System.out.println("name = " + name.replace('o', 'a'));     // replace one character to another
        System.out.println("is name var empty? " + name.isEmpty());     // check if string is empty
        System.out.println("does name contain spaces? " + name.contains(" "));      // check if string is contain a character
        System.out.println("checks equality of string " + name.equals("  Bro Code    "));
        System.out.println("checks equality of string " + name.equalsIgnoreCase("  Bro Code    "));

        //substring operator
        String email = "Brocode123@abc.email";
        System.out.println("user = " + email.substring(0, 10));  // cut string based on start (inclusive) to end (exclusive) index
        System.out.println("domain = " + email.substring(7));  // cut string based on - start (inclusive) index only {
    }
}
