import java.util.Scanner;

public class Assignment13 {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=0) {
            System.out.println(a);
        }else {
            System.out.println("Prints the number if the number is only negative.");
        }
        System.out.println("Exit..");

    }
}
