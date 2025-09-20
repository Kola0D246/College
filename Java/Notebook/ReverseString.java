import java.util.Scanner;

class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a phrase:");
        String text = sc.nextLine();
        String reverse = "";
        String[] words = text.split(" ");
        for (String word:words){
            reverse = word+" "+reverse;
        }
        System.out.print("Reversed text: " + reverse);
    }  
}
