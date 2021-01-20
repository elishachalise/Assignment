import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        float p,t,r,si;
        System.out.println("Enter the principle Amount : ");


        Scanner s = new Scanner(System.in);
        p=s.nextFloat();
        System.out.println("Enter the time in year: ");
        t=s.nextFloat();
        System.out.println("Enter the rate per year(Don't insert percent): ");
        r= s.nextFloat();
        si=(p*t*r)/100;
        System.out.println("Your Simple Interest is : "+si);

    }
}
