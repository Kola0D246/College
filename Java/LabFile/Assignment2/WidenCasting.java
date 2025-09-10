class WidenCasting {
    public static void main(String[] args) {
        int a = 20;
        double b = 15.5;
        double c = a*b;    // only assign if a*b is double, else error
        System.out.println(c);
    }
}
