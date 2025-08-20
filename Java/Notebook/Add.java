// Add n numbers argumented from cmd line

class Add {
    public static void main(String args[]) {
        int sum=0;
        for (String arg: args) {
            sum += Integer.parseInt(arg);
        }
        System.out.printf("%d", sum);
    }
}