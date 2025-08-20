public class Pyramid {
    public static void main (String args[]) {
        int N = Integer.parseInt(args[0]);
        for (int i=0; i<N; i++) {
            System.out.print(" ".repeat(N-i-1));
            System.out.println("*".repeat(i*2+1));
        }
    }
}
