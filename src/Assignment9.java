import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {
        System.out.println("===Pound to Kg===");
        float n=2.205f;
        float a,b,k,p;
        System.out.println("Enter the pound: ");
        Scanner s= new Scanner(System.in);
        a=s.nextFloat();
        k=a/n;
        System.out.println("Pound to KG: "+k);

        System.out.println("===Kg to Pound==");
        System.out.println("Enter the Kg: ");
        b=s.nextFloat();
        p=b*n;
        System.out.println("KG to Pound: "+p);

    }
}
