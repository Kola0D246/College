public class VariableScopeDemo{
    // Instance variable (object-level scope)
    int instanceVar = 10;

    // Static variable (class-level scope)
    static int staticVar = 20;

    public void showScope() {
        // Local variable (method-level scope)
        int localVar = 30;

        System.out.println("Inside showScope method:");
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);

        // Block scope
        if (true) {
            int blockVar = 40;
            System.out.println("Block Variable: " + blockVar);
        }

        // This would cause an error since blockVar not accessible outside that block
        // System.out.println(blockVar);
    }

    public static void main(String[] args) {

        VariableScopeDemo obj = new VariableScopeDemo();
        obj.showScope();

        System.out.println("\nInside main method:");
        System.out.println("Static Variable: " + staticVar);

        // Cannot access instance variable without object
        // System.out.println(instanceVar);

        // Cannot access local or block variables from another method
    }
}
