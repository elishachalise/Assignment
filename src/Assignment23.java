import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
        System.out.println("Sum of Number upto: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum= sum+i;

        }
        System.out.println("Sum of all no upto " +n+ " is : "+sum);


    }

}
