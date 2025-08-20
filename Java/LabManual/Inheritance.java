// Driver class
class Inheritance {
    public static void main(String[] args) {
        two t = new two();
        t.printGeek();
        t.print_for();

        two T = new two(20);
        T.printGeek();
        T.print_for();
        System.out.println(T.num);

        one O = new one();
        two TT = new two(25, 30);
        TT.printGeek();
        TT.print_for();
        System.out.println(O.num);
        System.out.println(TT.num);

    }
}

class one{
    static int num = 12;

    public void printGeek(){
        System.out.println("Geek"+num);
    }    
}

class two extends one {
    int year;

    two(){
        this.year = super.num;
    }

    two(int year) {
        this. year = year;
    }

    two(int num, int year){
        super.num = num;
        this.year = year;
    }
    public void print_for() {
        System.out.println("Geeks for "+year+" years");
    }
}
