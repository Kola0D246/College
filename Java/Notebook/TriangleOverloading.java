public class TriangleOverloading {
    public static void main(String[] args) {
        Triangle t0 = new Triangle();
        Triangle t1 = new Triangle(10);
        Triangle t2 = new Triangle(12, 15);
        Triangle t3 = new Triangle(6, 7, 4);
        Triangle t4 = new Triangle(t2);

        // Area
        System.out.println("<< Area >>");
        System.out.println("T0 = " + t0.area());
        System.out.println("T1 = " + t1.area());
        System.out.println("T2 = " + t2.area());
        System.out.println("T3 = " + t3.area());
        System.out.println("T4 = " + t4.area());

        // Perimeter
        System.out.println("<< Perimeter >>");
        System.out.println("T0 = " + t0.perimeter());
        System.out.println("T1 = " + t1.perimeter());
        System.out.println("T2 = " + t2.perimeter());
        System.out.println("T3 = " + t3.perimeter());
        System.out.println("T4 = " + t4.perimeter());
    }
}

class Triangle {
    private double height, base, side2, side3;

    Triangle(){
        this.base= this.side2= this.side3= 1.;
    }

    Triangle(double side){
        this.base= this.side2= this.side3= side;
    }

    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    Triangle(double side1, double side2, double side3){
        this.base=side1;
        this.side2=side2;
        this.side3=side3;
    }

    Triangle(Triangle T){
        this.height= T.height;
        this.base= T.base;
        this.side2= T.side2;
        this.side3= T.side3;
    }

    double getIsoscelesSide(double base, double height){
        return Math.sqrt(0.25*base*base + height*height);
    }

    double perimeter(){
        if (height!=0.){
            side2 = side3 = this.getIsoscelesSide(base, height);
        }
        return base+side2+side3;
    }

    double area(){
        if (height==0.){
            double SP = this.perimeter()/2;
            return Math.sqrt(SP*(SP-base)*(SP-side2)*(SP-side3));
        }
        else {
            return 0.5*base*height;
        }
    }
}
