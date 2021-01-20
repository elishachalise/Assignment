import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {

        double u,t,a,s;
        System.out.println("Enter the value of u: ");
        Scanner c = new Scanner(System.in);
        u=c.nextDouble();
        System.out.println("Enter the value of t: ");
        t=c.nextDouble();
        System.out.println("Enter the value of a: ");
        a=c.nextDouble();
        s=(u*t)+0.5*a*t*t;
        System.out.println("The Value of s: "+s);

    }
}
