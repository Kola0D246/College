public class CheckPrime {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        if (num == 2 || num == 3){
            System.out.println(true);
            return;
        }
        if (num%2 == 0 || num%3 == 0) {
            System.out.println(false);
            return;
        }
        for (int x = 5; x <= Math.sqrt(num); x+=6) {
            System.out.println("hello");
            if (num%(x) == 0 || num%(x+2) == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
