import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println(a+ " is even number");
        }else {
            System.out.println(a+ " is odd number.");
        }
    }
}
