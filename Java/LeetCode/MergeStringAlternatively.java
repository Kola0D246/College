/* Merge two strings by adding letters in alternating order. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string. */

class MergeStringAlternatively {
    public static void main(String[] args){
        int lenS1 = args[0].length();
        int lenS2 = args[1].length();
        StringBuilder newWord = new StringBuilder();
        // This is mutable array like object use to create string in loops
        int i=0;

        while (i<lenS1 || i<lenS2){
            if (i<lenS1) {
                newWord.append(args[0].charAt(i));
            }
            if (i<lenS2) {
                newWord.append(args[1].charAt(i));
            }
            i++;
        }

        System.out.println(newWord.toString());
        // toString() is method of StringBuilder that convert its object to Java String
    }
}
