class VowelConsonant {
    public static void main(String[] args) {
        char C = Character.toUpperCase(args[0].charAt(0));
        if (!Character.isLetter(C)) {
            System.out.printf("%c is not an alphabet\n", C);
            return;
        }

        switch (C) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf("%c is a vowel\n", C);
                break;

            default:
                System.out.printf("%c is a consonant\n", C);
        }
    }
}
