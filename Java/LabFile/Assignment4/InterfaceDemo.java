class InterfaceDemo {
    public static void main(String[] args) {
        Bank B1 = new PNB();
        B1.show();
    }
}

interface Bank {
    void show();        // default public
}

class PNB implements Bank {
    double interest = 7.1;
    public void show() {
        System.out.println("Interest rate: " + interest);
    }
}

