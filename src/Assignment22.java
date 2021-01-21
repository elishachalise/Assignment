import java.util.Scanner;

public class Assignment22 {
    public static void main(String[] args) {
        System.out.println("Enter the no you want multiplication table of: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Upto which no you want the multiplication of: ");
        int b= sc.nextInt();

        for(int i=1;i<=b;i++) {
            int m = a *i;
            System.out.println(a +"*" +i +"=" +m);
        }


    }
}
