class AreaTriangle {
    public static void main(String args[]) {
        float base = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);
        float area = 0.5f*base*height;
        System.out.printf("Area of triangle = %.2f", area);
    }
}

// Run: java AreaTriangle <base> <height>