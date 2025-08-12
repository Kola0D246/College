public class BinaryToHexa {
    static boolean isBinary(String num) {
        for (int i=0;i<num.length();i++) {
            if (num.charAt(i) != '0' && num.charAt(i) != '1') {
                System.out.println("Given sequence is not binary");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String hexa = "";
        int len = args[0].length();
        if (!isBinary(args[0])) {
            return;
        }
        int binary = Integer.parseInt(args[0]);
        for (int i=0; i<=len/4; i++) {
            int block = binary%10000;
            binary /= 10000;

            switch (block) {
                case 0000:
                    hexa= hexa+"0";
                    break;
                case 0001:
                    hexa= hexa+"1";
                    break;
                case 0010:
                    hexa= hexa+"2";
                    break;
                case 0011:
                    hexa= hexa+"3";
                    break;
                case 0100:
                    hexa= hexa+"4";
                    break;
                case 0101:
                    hexa= hexa+"5";
                    break;
                case 0110:
                    hexa= hexa+"6";
                    break;
                case 0111:
                    hexa= hexa+"7";
                    break;
                case 1000:
                    hexa= hexa+"8";
                    break;
                case 1001:
                    hexa= hexa+"9";
                    break;
                case 1010:
                    hexa= hexa+"A";
                    break;
                case 1011:
                    hexa= hexa+"B";
                    break;
                case 1100:
                    hexa= hexa+"C";
                    break;
                case 1101:
                    hexa= hexa+"D";
                    break;
                case 1110:
                    hexa= hexa+"E";
                    break;
                case 1111:
                    hexa= hexa+"F";
                    break;
            }
        }
    }
}
