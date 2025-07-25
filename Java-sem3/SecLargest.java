// Write a program to compare 3 given number and display 2nd largest number

public class SecLargest {
    public static void main(String num[]){  // cmd line argumentation - create an array of string separated by space
        int num1, num2, num3;
        num1= Integer.parseInt(num[0]);     // we cannot do simple type casting from string to int because java is a rulezilla :>
        num2= Integer.parseInt(num[0]);     // parsing check if the cmd input (which is string) contain only numerical value
        num3= Integer.parseInt(num[0]);     // if not, it throw NumberFormatException!

        if (num2>num1 && num1>num3 || num3>num1 && num1>num2) {
            System.out.printf("%d",num1);
            }
        else if (num1>num2 && num2>num3 || num3>num2 && num2>num1) {
            System.out.printf("%d",num2);
            }
        else if (num1>num3 && num3>num2 || num2>num3 && num3>num1) {
            System.out.printf("%d",num3);
            }
    }
}
 