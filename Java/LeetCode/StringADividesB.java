/* For two strings s and t, "t divides s" if and only if s = t + t + t + ... + t (i.e., t is concatenated with itself one or more times to form s).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2
*/

class StringADividesB {
    static int HCF(int a, int b){
        if (a==0) return b;
        if (b==0) return a;
        if (a==b) return a;
        if (a>b) return HCF(a-b, b);
        return HCF(a, b-a);
    }

    public static void main(String[] args){
        StringBuilder x = new StringBuilder();
        int lenS1 = args[0].length();
        int lenS2 = args[1].length();
        int hcf = HCF(lenS1, lenS2);

        for(int i=0; i<hcf; i++){
            if (args[0].charAt(i) == args[1].charAt(i)) {
                x.append(args[0].charAt(i));
            } else {
                break;
            }
        }
        
        while (i<args[0].length() || i<args[1].length()) {

        }

    }
}
