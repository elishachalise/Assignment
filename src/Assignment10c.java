import java.util.Scanner;

public class Assignment10c {
    public static void main(String[] args) {
        double b,a,c,d,e,f;
        System.out.println("Enter the value of a: ");
        Scanner s = new Scanner(System.in);
        a= s.nextDouble();
        System.out.println("Enter the value of b: ");
        b=s.nextDouble();
        System.out.println("Enter the vanlue of c: ");
        c=s.nextDouble();
        d=b*b-4*a*c;
        e=Math.sqrt(d);
        f=(-b+e)/(2*a);

        System.out.println("Result of f : " +f);



    }

}
