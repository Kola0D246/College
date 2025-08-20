class Overloading{
    public static void main(String[] args) {
        int x=2, y=3, z=4;
        float m=5.7f, n=7.5f;

        Cs c1 = new Cs();
        Cs c2 = new Cs(x,z);
        c1.printData();
        c2.printData();

        int k = c1.add(x,y);
        int l = c1.add(x,y,z);
        float o = c1.add(m,n);
        System.out.println("x+y="+k);
        System.out.println("x+y+z="+l);
        System.out.println("m+n="+o);

        float s = c2.add(y,z);
        System.out.println("x+z="+s);
    }
}

class Cs {
    int p,q;

    // constructor overloading
    public Cs(){
        //empty
    }

    public Cs(int x, int y) {
        p=x; q=y;
    }

    // method overloading
    public int add(int i, int j){
        return i+j;
    }

    public int add(int i, int j, int k){
        return i+j+k;
    }

    public float add(float f1, float f2){
        return f1+f2;
    }

    public void printData() {
        System.out.println("p ="+p);
        System.out.println("q ="+q);
    }
}
