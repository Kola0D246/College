public class RectangleConstructors {
    public static void main(String[] args) {
        int a = 20, b = 12;

        Rectangle R1 = new Rectangle();
        Rectangle Sq = new Rectangle(12);
        Rectangle R2 = new Rectangle(a, b);
        Rectangle R3 = new Rectangle(R2);

        // Area
        System.out.println("<< Area >>");
        System.out.println("R1 = " + R1.area());
        System.out.println("Sq = " + Sq.area());
        System.out.println("R2 = " + R2.area());
        System.out.println("R3 = " + R3.area());

        // Perimeter
        System.out.println("<< Perimeter >>");
        System.out.println("R1 = " + R1.perimeter());
        System.out.println("Sq = " + Sq.perimeter());
        System.out.println("R2 = " + R2.perimeter());
        System.out.println("R3 = " + R3.perimeter());
    }
}

class Rectangle{
    private int length, width;

    // empty constructor -> assign default values
    Rectangle(){
        length = width =1;
    }

    // single argument -> assign same value to both feilds ie Square
    Rectangle(int side){
        length = width = side;
    }

    // two arguments
    Rectangle(int len, int wdt){
        length = len; width = wdt;
    }

    // copy constructor
    Rectangle(Rectangle R){
        length = R.length;
        width = R.width;
    }

    // class methods
    int area(){
        return length*width;
    }

    int perimeter(){
        return 2*(length+width);
    }
}

