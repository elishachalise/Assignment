import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        System.out.println("==Fahrenheit to Celsisus====");
        double F,C;
        System.out.println("Enter temperature in Fahrenheit: ");
        Scanner s = new Scanner(System.in);
        F=s.nextDouble();
        C=(F-32)*0.5556;
        System.out.println("Temperature in Celsisus: "+C);


        System.out.println("==Celsisus to Fahrenheit===");
        double f,c;
        System.out.println("Enter the temperature in Celsisus");
        c=s.nextDouble();
        f=((c*9)/5)+32;
        System.out.println("Temperature in Fahrenheit: "+f);
    }
}
