public class BinaryToHexa2 {
    static int toDecimal(String binary) {
        int sum =0, len = binary.length();

        for (int i=0;i<len;i++) {
            char bit = binary.charAt(i);
            if (bit != '0' && bit != '1') {
                System.out.println("Given sequence is not binary");
                return -1;
            }
            else if (bit == '1') {
                sum += (int) Math.pow(2, len-1-i);
            }
        }
        return sum;
    }

    static String toHexa(int num) {
        String hexa="";
        int temp;
        if (num == 0) {hexa="0";}
        while (num != 0) {
            temp = num%16;
            switch (temp) {
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
                    hexa = temp + hexa;
            }
            num /= 16;
        }
        return hexa;
    }

    public static void main(String[] args) {
        int dec = toDecimal(args[0]);
        if (dec == -1){return;}     // not correct binary

        String hexa = toHexa(dec);
        
        System.out.printf("Hexadecimal for %s = %s", args[0], hexa);
    }
}
