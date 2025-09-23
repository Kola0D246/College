class ConstantInterface {
    public static void main (String [] args){
        Sphere S=new Sphere(5);
        System.out.println("Area="+ S.SurfArea());
        System.out.println("Eulers Number (E)="+MathConstants.E);
    }
}

interface MathConstants {
    double PI=3.14159;
    double E=2.71828;
}

class Sphere implements MathConstants {
    double radius;
    Sphere (double R){
        this.radius=R;
    }
    double SurfArea(){
        return (4*MathConstants.PI*radius*radius);
    }
}
