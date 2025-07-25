// Write a program to display months in words if word is given in number

public class MonthName {
    public static void main(String args[]) {
        int num= 15;
        String month[] = {"January","Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        //check for value error
        if (num <1 || num > 12){
            System.out.printf("number of month cannot be less than 0 or greater than 12");
        }
        else {
            System.out.printf("The %d month of year is %s",num, month[num-1]);
        }
    }
}
