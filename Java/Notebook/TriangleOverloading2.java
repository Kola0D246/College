public class TriangleOverloading2 {
    public static void main(String[] args) {
        Triangle T = new Triangle();
        double height=0, base=12, side2=15, side3=9;

        // Area
        System.out.println("<< Area >>");
        System.out.println("only 1 side => " + T.area(side2));
        System.out.println("base height =>" + T.area(base, height));
        System.out.println("all 3 side  => " + T.area(base, side2, side3));

        // Perimeter
        System.out.println("<< Perimeter >>");
        System.out.println("only 1 side => " + T.perimeter(side3));
        System.out.println("only 2 side => " + T.perimeter(base, side2));
        System.out.println("all 3 side  => " + T.perimeter(base, side2, side3));

        System.out.println("<< Get Height >>");
        System.out.println("only 1 side => " + T.getHeight(side3));
        System.out.println("only 2 side => " + T.getHeight(base, side2));
        System.out.println("all 3 side  => " + T.getHeight(base, side2, side3));

    }
}

class Triangle {
    double perimeter(double base){
        return 3*base;
    }

    double perimeter(double base, double side2){
        return base+ 2*side2;
    }

    double perimeter(double base, double side2, double side3){
        return base+side2+side3;
    }

    double area(double side){
            return 0.25*side*side*Math.sqrt(3);
        }

    double area(double base, double height){
        return 0.5*base*height;
    }

    double area(double base, double side2, double side3){
        double SP = 0.5*(base+side2+side3);
        return Math.sqrt(SP*(SP-base)*(SP-side2)*(SP-side3));
    }

    double getHeight(double base){
        return 0.5*base*Math.sqrt(5);
    }

    double getHeight(double base, double side2){
        return 0.5*Math.sqrt(4*side2*side2 - base*base);
    }

    double getHeight(double base, double side2, double side3){
        return 2*area(base, side2, side3)/base;
    }

    double getThirdside(double base, double height){
        return 0.5*Math.sqrt(4*height*height + base*base);
    }

    double getThirdside(double base, double height, double side2){
        double heightSq = height*height;
        double side2Sq = side2*side2;
        return base*(base + side2Sq + 2*Math.sqrt(side2Sq - heightSq));
    }
}

