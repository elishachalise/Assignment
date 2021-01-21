import java.util.Scanner;

public class Assignment20 {
    public  static void main(String[] args) {
        System.out.println("Enter the two number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter the Operator(+,-,*,/): ");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                double d = a + b;
                System.out.println("Addition of " + a + " and " + b + " is: " + d);
                break;

            case '-':
                d = a - b;
                System.out.println("Subtraction of " + a + " and " + b + " is: " + d);
                break;
            case '*':
                d = a * b;
                System.out.println("Multiplication of " + a + " and " + b + " is: " + d);
                break;
            case '/':
                d = a / b;
                System.out.println(+a + " divided by " + b + " is " + d);
                break;

            default:
                System.out.println("Wrong Operator!!!!");
                break;

        }
    }
}
