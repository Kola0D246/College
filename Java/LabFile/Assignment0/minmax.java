// find min and max from numbers given in cmd line argument

public class minmax {
    public static void main(String args[]) {
        int min = Integer.parseInt(args[0]), num;
        int max = Integer.parseInt(args[0]);
        for (String arg: args) {
            num = Integer.parseInt(arg);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Min = %d", min);
        System.out.printf("Max = %d", max);
    }
}
