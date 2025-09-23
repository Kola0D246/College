class FinalParameter { 
    public static void main(String[] args) { 
        new FinalParameter().display(50); 
    }
    
    void display(final int x) { 
        System.out.println("Value = " + x); 
        // x = x + 10;      //-- Error 
    }
}