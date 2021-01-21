import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("The year is a leap year (it has 366 days).");
                }else {
                    System.out.println("The year is not a leap year (it has 365 days).");
                }
            }else {
                System.out.println("The year is a leap year (it has 366 days).");
            }

        }else {
            System.out.println("The year is not a leap year (it has 365 days).");
        }
    }
}
