import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Please Enter the two number: ");
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        b=s.nextInt();
        c=a+b;
        d=c/2;
        System.out.println("Sum of two number : "+c);
        System.out.println("Average of two number: "+d);

    }
}
