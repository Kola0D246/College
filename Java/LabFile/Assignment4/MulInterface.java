class MulInterface {
    public static void main (String [] args){
    MySystem S1=new MySystem();
    S1.print();
    S1.display();
    }
}

interface Print {
    void print();
}

interface Display {
    void display();
}

class MySystem implements Print, Display {
    public void print(){
        System.out.println("Printing on sheet...");
    }

    public void display(){
        System.out.println("Displaying on screen...");
    }
}