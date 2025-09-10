class Ar_Rectangle {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10, 12);
        System.out.println("Area of R1 = " + R1.area() + " unit sq");
        System.out.println("Area of R1 = " + R2.area() + " unit sq");
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = breadth = 1;
    }

    Rectangle(int L, int B) {
        length = L;
        breadth = B;
    }

    int area() {
        return length*breadth;
    }
}
