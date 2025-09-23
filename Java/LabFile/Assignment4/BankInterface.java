class BankInterface {
    public static void main(String[] args) {
        Bank B1 = new SBI();
        Bank B2 = new HDFC();
        Bank B3 = new PNB();
        B1.createAcc();
        B2.createAcc();
        B3.createAcc();
    }
}

interface Bank {
    void createAcc();
}

class SBI implements Bank {
    public void createAcc() {
        System.out.println("Creating account in SBI");
    }
}

class HDFC implements Bank {
    public void createAcc() {
        System.out.println("Creating account in HDFC");
    }
}

class PNB implements Bank {
    public void createAcc() {
        System.out.println("Creating account in PNB");
    }
}