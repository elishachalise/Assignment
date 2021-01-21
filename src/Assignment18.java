import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {

        System.out.println("Enter three no: ");
        int a , b , c ;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);

        if(a>b && a>c){
            System.out.println("a is greater.");
        }else if(b>c && b>a){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

    }
}
