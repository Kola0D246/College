class Ar_Circle {
    public static void main(String[] args) {
        Circle C1 = new Circle(10);
        C1.area();
    }
}

class Circle {
    int radius;

    Circle(int R) {
        this.radius = R;
    }

    void area() {
        System.out.println("Area = " + 3.141*radius*radius + " unit sq");
    }
}
