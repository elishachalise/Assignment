import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the two number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        if(a>b) {
            System.out.println("a is greater than b");
        }
        else if(a<b) {
            System.out.println("b is greater than a ");
        }else {
            System.out.println("a is equal to b");
        }
        System.out.println("Exit");

    }
}
