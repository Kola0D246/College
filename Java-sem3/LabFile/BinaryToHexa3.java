public class BinaryToHexa3 {
    // function to check if number is binary or not and convert it to decimal value
    // we can also use Integer.parseInt(binary, 2) for same result where binary is in string and 2 is base of input value ie binary

    static int toDecimal(int binary) {
        int bit, place=1, sum=0;
        while (binary > 0) {
            bit = binary % 10;
            if (bit != 0 && bit != 1){
                System.out.println("Given sequence is not binary");
                return -1;
            }
            sum += bit*place;
            binary /= 10;
            place *=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int binary = Integer.parseInt(args[0]);
        String hexa = "";
        int block, decimal;
        
        while (binary > 0) {
            block = binary%10000;
            binary /= 10000;
            decimal = toDecimal(block);

            if (decimal == -1) {return;}    // not binary value
            switch (decimal) {
                case 10:
                    hexa = "A"+hexa;
                    break;
                case 11:
                    hexa = "B"+hexa;
                    break;
                case 12:
                    hexa = "C"+hexa;
                    break;
                case 13:
                    hexa = "D"+hexa;
                    break;
                case 14:
                    hexa = "E"+hexa;
                    break;
                case 15:
                    hexa = "F"+hexa;
                    break;
                default:
                    hexa = decimal + hexa;
            }
        }

        System.out.println("Hexadecimal =" + hexa);
    }
}
