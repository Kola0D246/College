public class BinaryToHexa3 {
    // function to check if number is binary or not and convert it to decimal value
    // we can also use Integer.parseInt(binary, 2) for same result where binary is in string and 2 is base of input value ie binary

    static int nibbleToDecimal(int nibble) {
        int bit, place=1, sum=0;
        while (nibble > 0) {
            bit = nibble % 10;
            if (bit != 0 && bit != 1){
                System.out.println("Given sequence is not binary");
                return -1;
            }
            sum += bit*place;
            nibble /= 10;
            place *=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int binary = Integer.parseInt(args[0]);
        String hexa = "", alpha[] = {"A","B","C","D","E","F"};
        int block, decimal;
        
        while (binary > 0) {
            block = binary%10000;
            binary /= 10000;
            decimal = nibbleToDecimal(block);

            if (decimal == -1) {return;}    // not binary value
            else if (decimal < 10) {hexa = decimal + hexa;}
            else {hexa = alpha[decimal-10] + hexa;}
        }

        System.out.println("Hexadecimal =" + hexa);
    }
}
