class Rectangle{
    public static void main(String[] args){
        int len = 10, wdt = 4;
        Rectngle r1 = new Rectngle();

        r1.setDimention(len, wdt);
        r1.showDimention();
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
    }
}

class Rectngle{
    private int length, width;

    void setDimention(int l, int w){    // setter
        this.length = l;
        this.width = w;
    }

    void showDimention(){               // getter
        System.out.println("length: "+length);
        System.out.println("width: "+width);
    }

    int area(){
        return length*width;
    }

    int perimeter(){
        return 2*(length+width);
    }

}