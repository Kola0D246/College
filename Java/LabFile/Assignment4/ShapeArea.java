class ShapeArea{
    public static void main (String [] args){
        Shape S1=new Circle(10);
        Shape S2=new Rectangle(5,7);
        Shape S3=new Triangle(12,4);

        System.out.println("Area of Circle="+S1.area());
        System.out.println("Area of Rectangle="+S2.area());
        System.out.println("Area of Triangle="+S3.area());
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double R) {
        this.radius = R;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double L, double B) {
        this.length = L;
        this.breadth = B;
    }

    public double  area() {
        return length * breadth;
    }
}

class Triangle implements Shape{
    double base,height;
    Triangle (double B, double H){
        this.base=B;
        this.height=H;
    }
    public double  area(){
        return 0.5*base*height;
    }
}